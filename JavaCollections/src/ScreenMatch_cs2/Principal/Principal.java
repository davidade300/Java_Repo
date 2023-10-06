package ScreenMatch_cs2.Principal;
import java.util.ArrayList;

import ScreenMatch_cs2.Calculos.CalculadoraDeTempo;
import ScreenMatch_cs2.Calculos.FiltroRecomendacao;
import ScreenMatch_cs2.Modelo.Episodio;
import ScreenMatch_cs2.Modelo.Filme;
import ScreenMatch_cs2.Modelo.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Olha eu aqui denovo", 1970); // tipo por referência
        //meuFilme.setNome("Olha eu aqui denovo");
        //meuFilme.setAnoDeLancamento(1970); 
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duracao do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        //System.out.println(meuFilme.totalDeAvalicoes);
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvalicoes = 1;
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("xD",2023); // tipo por referência
        //outroFilme.setNome("xD");
        //outroFilme.setAnoDeLancamento(2023); 
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
        //filmeDoPaulo.setNome("Dogville");
        //filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDoPaulo);
        System.out.println("Tamanho da lista de filme: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.toString());
        
        
    }
}
