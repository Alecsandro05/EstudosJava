package estudo.cursoJava.javacore.introducaoClasses.eSobrecargaDeContrutores.teste;

import estudo.cursoJava.javacore.introducaoClasses.eSobrecargaDeContrutores.dominio.Serie;

public class SerieTeste01 {
    public static void main(String[] args) {
        Serie serie = new Serie("friends", "tv", 60, "comedia", "Bros Studios de Burbank");
//        serie.init("friends", "tv", 600, "comedia");

        serie.imprime();
    }
}
