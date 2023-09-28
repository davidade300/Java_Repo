package Curso_1;
import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu filme favorito?");
        String filme = sc.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLançamento = sc.nextInt();
        System.out.println("Qual nota voce da para o filme?");
        double nota = sc.nextDouble();
        System.out.println();
        System.out.printf(filme + ", " + anoDeLançamento + ", " + "%.2f", nota);


        sc.close();
    }
}
