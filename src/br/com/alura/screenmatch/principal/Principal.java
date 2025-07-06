package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme(1999, "Matrix");

        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " + favorito.obtemMedia());

        Serie lost = new Serie(2000, "lost");

        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());

        Filme interestelar = new Filme(2014, "Interestelar");

        interestelar.setDuracaoEmMinutos(233);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(favorito);
        calculadora.incluir(interestelar);
        calculadora.incluir(lost);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoCarlos = new Filme(1972, "O Poderoso Chefão");

        filmeDoCarlos.setDuracaoEmMinutos(200);
        filmeDoCarlos.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoCarlos);
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(interestelar);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getName());
        System.out.println(listaDeFilmes.toString());

    }

}
