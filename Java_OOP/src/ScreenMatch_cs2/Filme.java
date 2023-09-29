public class Filme{
    String nome; //atributos
    int anoDeLancamento; //atributos
    boolean incluidoNoPlano; //atributos
    double somaDasAvaliacoes; //atributos
    int totalDeAvalicoes; //atributos
    int duracaoEmMinutos; // atributos
    
    // metodo \/
    void exibeFichaTecnica(){ //nao tem argumentos portanto () vazio
        // metodos que nao retornam nenhum argumento nada tem como palavra chave "void"
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    } 
    
     // metodo \/
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes++;
    }

    // metodo \/
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvalicoes;
    }

}