import Calculos.CalculadoraDeTempo;
import Calculos.FiltroRecomendacao;
import Model.Episodio;
import Model.Filme;
import Model.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme(); // tipo por referência
        meuFilme.setNome("Olha eu aqui denovo");
        meuFilme.setAnoDeLancamento(1970); 
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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme(); // tipo por referência
        outroFilme.setNome("xD");
        outroFilme.setAnoDeLancamento(2023); 
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
        
    }
}
