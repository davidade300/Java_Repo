package Model;

public class MinhasPreferidas {
    
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é uma das preferidas!");
        } else {
            System.out.println("Excelente opção para ouvir daqui a pouco");
        }
    }

}
