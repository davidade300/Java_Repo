package ScreenMatch_cs2.Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import ScreenMatch_cs2.Calculos.CalculadoraDeTempo;
import ScreenMatch_cs2.Calculos.FiltroRecomendacao;
import ScreenMatch_cs2.Modelo.Episodio;
import ScreenMatch_cs2.Modelo.Filme;
import ScreenMatch_cs2.Modelo.Serie;
import ScreenMatch_cs2.Modelo.Titulo;

public class PrincipalComListas {
     public static void main(String[] args) {

        Filme meuFilme = new Filme("Olha eu aqui denovo", 1970); // tipo por referência
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duracao do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
      
        System.out.println(meuFilme.pegaMedia());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("xD",2023); // tipo por referência
        outroFilme.setDuracaoEmMinutos(181);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.settotalDeVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        System.out.println("Tamanho da lista de filme: " + lista.size());
        System.out.println("Primeiro filme da lista: " + lista.get(0).getNome());
        System.out.println(lista.toString());
        lista.add(lost);

        // enhanced for \/
        for(Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) { 
            // já pergunta e já declara a variável /\
            System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        // faz a ordenação pelo ano de lancamento
        System.out.println("Ordenando por ano");
        System.out.println(lista);
        
    }
}
