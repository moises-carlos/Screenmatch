package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os mais assistidos do momento");

        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Está entre os mais populares do momento");
        } else {
            System.out.println("coloque na sua lista para assistir depois");
        }

    }

}


