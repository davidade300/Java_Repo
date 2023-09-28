package Curso_1;
import java.util.Scanner;

public class LoopsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double mediaAvaliacao  = 0;

        // for(tipo variavel = valor; variavel condição; variavel (in/de)cremento)
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliacao para o filme: ");
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media das avaliacoes " + mediaAvaliacao/3);

        sc.close();
    }
}
