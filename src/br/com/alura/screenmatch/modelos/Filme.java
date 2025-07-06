package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(int anoDeLancamento, String name) {
        super(anoDeLancamento, name);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) obtemMedia() / 2;
    }

    @Override
    public String toString() {
        return "filme: " + getName();
    }

}
