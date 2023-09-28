public class Condicional_if {
    public static void main(String[] args) {
        
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tiploPlano = "plus";
        
        if (anoDeLancamento >= 2022){
            System.out.println("lançamento que os clientes estão curtindo");
        } else{
            System.out.println("Filme retro que vale a pena assistir"); 
        }

        if (incluidoNoPlano && tiploPlano.equals("plus") ){
            System.out.println("Filme liberado");
        } else {
            System.out.println( " Deve pagar a locacao");
        }

    }
}
