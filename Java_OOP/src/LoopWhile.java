import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int qtd_notas = 0;
        

        while(nota != -1){
            System.out.println("Digite a sua avaliacao para o filme ou -1 para encerrar: ");
            nota = sc.nextDouble();
            if (nota != -1){
            mediaAvaliacao += nota;
            qtd_notas++ ;
            }
        }
        
        System.out.println("Media das avaliacoes " + mediaAvaliacao / qtd_notas);

        sc.close();
    }
}
