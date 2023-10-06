package ScreenMatch_cs2.Modelo;

import ScreenMatch_cs2.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{ // implements nomeDaInterface{ }
// interface serve como se fosse uma segunda heranca, já que java não possui herança multipla
    private String diretor; //atributos

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
    // já que todos os objetos estendem a classe object, dessa forma ao printarmos um objeto filme,
    // em vez de printar a mensagem padrão + @ + endereço de memoria, será printado a implementacao
    // do override do toString() 
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }
    
    
    
}