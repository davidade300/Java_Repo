import David.ScreenMatch.Modelo.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme(); // tipo por referência
        meuFilme.nome = "Olha eu aqui denovo";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

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
    }
}
