package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    // public void inclui(Filme f) {
    //     this.tempoTotal += f.getDuracaoEmMinutos();
    // }

    // public void inclui(Serie s) {
    //     this.tempoTotal += s.getDuracaoEmMinutos();
    // }

    public void incluir(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
