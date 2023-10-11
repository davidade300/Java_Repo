package Cs_2_Desafio.Model;

import java.util.List;

public class Cartao {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public Cartao(double limite, double saldo) {
        this.limite = limite;
        this.saldo = saldo;
    }
}
