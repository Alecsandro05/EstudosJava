package estudo.cursoJava.javacore.introducaoClasses.dSobrecargaMetodos.teste;

import estudo.cursoJava.javacore.introducaoClasses.dSobrecargaMetodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive2", "TV", 12, "Ação");
//        anime.setTipo("Tv");
//        anime.setEpisodios(12);
//        anime.setNome("Akudama Drive");
        anime.imprime();
    }
}
// sobrecarga de metodos: é ter um metodo com o memso nome porem o tipo ou a quantidade dos parametros saõ difenretes