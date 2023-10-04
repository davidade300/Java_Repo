package Curso_1;

public class Main {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        double notaDoFilme = 8.1;
        String sinopse;
        
        sinopse = """
                Filme: Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!, nota %.2f 
                Ano de lançamento %d
                """.formatted(notaDoFilme,anoDeLancamento);
        
        System.out.println(sinopse);

        
    }
}
