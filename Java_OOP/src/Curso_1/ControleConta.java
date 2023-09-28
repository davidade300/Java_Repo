package Curso_1;
import java.util.Scanner;

public class ControleConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Donnie Yagabodigity";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0 ;
        

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************\n");

        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir valor
                3 - Receber Valor
                4 - Sair
                """;
        while(opcao != 4){
            System.out.println(menu);
            
            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atual é " + saldo + "\n");
            }
            else if(opcao == 2){
                System.out.println("Qual o valor que você deseja transferir ? ");
                double valor = sc.nextDouble();
                if(valor > saldo){
                    System.out.println("Não há saldo suficiente" + "\n");
                }else{
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo + "\n");
                }
            }
            else if(opcao == 3){
                System.out.println("Digite o valor a ser recebido: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("novo saldo : " + saldo + "\n");
            } else if (opcao != 4){
                System.out.println("Opção inválida" + "\n");
            } 
        }
        sc.close();
    }
}
