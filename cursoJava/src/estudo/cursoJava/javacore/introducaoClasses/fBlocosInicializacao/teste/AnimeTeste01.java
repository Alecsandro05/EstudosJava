package estudo.cursoJava.javacore.introducaoClasses.fBlocosInicializacao.teste;

import estudo.cursoJava.javacore.introducaoClasses.fBlocosInicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
