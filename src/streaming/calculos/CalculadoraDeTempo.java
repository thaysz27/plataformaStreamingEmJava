package streaming.calculos;

import streaming.modelos.Filme;
import streaming.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluir(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
