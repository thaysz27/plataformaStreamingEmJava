package streaming.principal;

import streaming.modelos.Filme;
import streaming.modelos.Titulo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var filme1 = new Filme("Interestelar", 2014);
        filme1.setDuracaoEmMinutos(169);
        filme1.avalia(10);


        var filme2 = new Filme("A chegada", 2016);
        filme2.setDuracaoEmMinutos(116);
        filme2.avalia(9);

        var filme3 = new Filme("Passageiros", 2016);
        filme3.setDuracaoEmMinutos(116);
        filme3.avalia(8.6);

        List<Filme> listaDeFilmes = new LinkedList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println(listaDeFilmes);
        Collections.sort(listaDeFilmes);
        System.out.println(listaDeFilmes);
        listaDeFilmes.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(listaDeFilmes);

    }
}