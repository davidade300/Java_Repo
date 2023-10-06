package ScreenMatch_cs2.Modelo;

import ScreenMatch_cs2.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{ // implements nomeDaInterface{ }
    // interface serve como se fosse uma segunda heranca, já que java não possui herança multipla
    private String diretor; //atributos

    /* public Filme(String nome, int ano) { //construtor da classe, quando implementamos um filme sem nome,
    // o java usa o construtor padrão, que cria um objeto vazio, ja quando criamos um construtor numa classe,
    // fazemos com que so seja possivel instanciar um novo objeto através do construtor da classe.
    // se você tem duvida quanto a necessidade de certo metodo, não implemente-o.
        this.setNome(nome);
    } */

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
    

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override //sobrescreve o metodo toString, inerente à todos os objetos,
    // já que todos os objetos estendem(são filhos da) a classe object, dessa forma ao printarmos um objeto filme,
    // em vez de printar a mensagem padrão + @ + endereço de memoria, será printado a implementacao
    // do override do toString() 
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }
    
    
    
}