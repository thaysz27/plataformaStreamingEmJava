package streaming.principal;

import streaming.modelos.Filme;
import streaming.modelos.Serie;
import streaming.modelos.Titulo;

import java.util.ArrayList;

public class MainComLista {
    public static void main(String[] args) {
        var filme1 = new Filme("Interestelar", 2014);
        var filme2 = new Filme("A chegada", 2016);
        var filme3 = new Filme("Passageiros", 2016);
        var serie1 = new Serie("Dark", 2017);

        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(filme1);
        listaAssistidos.add(filme2);
        listaAssistidos.add(filme3);
        listaAssistidos.add(serie1);

        for (Titulo item: listaAssistidos) {
            System.out.println(item);
        }
    }
}
