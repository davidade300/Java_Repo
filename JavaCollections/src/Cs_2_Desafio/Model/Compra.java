package Cs_2_Desafio.Model;

public class Compra implements  Comparable<Compra>{
    private String nomeProduto;
    private double valor;

    public Compra(String nomeProduto, double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: descricao: " + nomeProduto + " valor: " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
