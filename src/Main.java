import streaming.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Interestelar");
        filme1.setAnoLancamento(2014);
        filme1.setDuracaoEmMinutos(169);

        System.out.println(filme1.getTotalDeAvaliacoes());


    }
}