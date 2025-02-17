package streaming.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import streaming.excecao.ErroDeConversaoException;
import streaming.modelos.Titulo;
import streaming.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        String apiKey = "";
        Scanner leitura = new Scanner(System.in);
        String busca = "";

        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("O que deseja assistir?");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + apiKey;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());


                String json = response.body();

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Título convertido");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                    System.out.println("Aconteceu um erro: ");
                    System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                    System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoException e) {
                    System.out.println(e.getMessage());
            }
        }

        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

    }
}
