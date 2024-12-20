package estudo.cursoJava.javacore.introducaoClasses.hAssociacao.teste;

import estudo.cursoJava.javacore.introducaoClasses.hAssociacao.dominio.Jogador;
import estudo.cursoJava.javacore.introducaoClasses.hAssociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Rodrygo");
        Jogador jogado3 = new Jogador("Vini");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador,jogador2,jogado3};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ----");

        jogador.imprime();

        System.out.println("--- time ----");
        time.imprime();
    }
}
