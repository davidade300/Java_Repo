package Model;
public class Filme{
    private String nome; //atributos
    private int anoDeLancamento; //atributos
    private boolean incluidoNoPlano; //atributos
    private double somaDasAvaliacoes; //atributos
    private int totalDeAvalicoes; //atributos
    private int duracaoEmMinutos; // atributos
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // metodo \/
    public void exibeFichaTecnica(){ //nao tem argumentos portanto () vazio
        // metodos que nao retornam nenhum argumento nada tem como palavra chave "void"
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    } 
    
     // metodo \/
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes++;
    }

    // metodo \/
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvalicoes;
    }

}