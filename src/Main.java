import classes.MinhasPreferidas;
import classes.Musica;
import classes.Podcast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("kiss");

        for(int i = 0; i < 1000; i++) {
           minhaMusica.reproduzir();

        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("#200 - MC RYAN");
        meuPodcast.setHost("PodPah");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();;
        }

        for (int i = 0; i <1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}