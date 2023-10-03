package Model;

import Calculos.Classificavel;

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
    
}