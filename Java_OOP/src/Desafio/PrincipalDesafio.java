import Model.MinhasPreferidas;
import Model.Musica;
import Model.Podcast;

public class PrincipalDesafio {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Forever");
        minhamusica.setCantor("Kiss");

        for (int i = 0; i < 2004; i++){
            minhamusica.reproduz();
        }

        for (int i = 0 ; i < 50; i++){
            minhamusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolhadev");
        meuPodcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 1000; i ++){
           meuPodcast.reproduz(); 
        }

        for(int i = 0; i < 1000; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhamusica);
    }
}
