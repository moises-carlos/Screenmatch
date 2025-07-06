package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme favorito = new Filme(1999, "Matrix");
        favorito.avalia(5);
        Serie lost = new Serie(2000, "lost");
        Filme interestelar = new Filme(2014, "Interestelar");
        interestelar.avalia(10);
        Filme filmeDoCarlos = new Filme(1972, "O Poderoso Chefão");
        filmeDoCarlos.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(lost);
        lista.add(interestelar);
        lista.add(filmeDoCarlos);

        for (Titulo item : lista) {
            System.out.println(item.getName());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());

            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Keanu Reeves");
        buscaPorArtista.add("Matthew McConaughey");
        buscaPorArtista.add("Al Pacino");

        Collections.sort(buscaPorArtista);
        System.out.println("Lista ordenada: " + buscaPorArtista);

        System.out.println("Lista de títulos ordenada:");
        Collections.sort(lista);
        for (Titulo titulo : lista) {
            System.out.print(titulo.getName() + ", ");
        }
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("\nLista de títulos ordenada por ano de lançamento:");
        for (Titulo titulo : lista) {
            System.out.print(titulo.getName() + ", ");
        }
    }
}
