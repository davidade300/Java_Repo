package ScreenMatch_cs2.Modelo;

import ScreenMatch_cs2.Excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
   //@SerializedName("Title") // anotacoes sao metadados
    private String nome; //atributos
    //@SerializedName("Year")
    private int anoDeLancamento; //atributos
    private boolean incluidoNoPlano; //atributos
    private double somaDasAvaliacoes; //atributos
    private int totalDeAvalicoes; //atributos
    //@SerializedName("Runtime") -> gera erro de compilacao
    private int duracaoEmMinutos; // atributos

    

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.Title();
        if(meuTituloOmdb.year().length() > 4 ){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano" +
                    " porque tem mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.Runtime().substring(0,2));
    }

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

    @Override
    public String toString() {
        return "Titulo{" + "nome: '" + nome +'\'' +", ano de lancamento: " +
                anoDeLancamento + "," + duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(nome);
    }
}
