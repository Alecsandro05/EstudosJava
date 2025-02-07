package estudo.cursoJava.javacore.introducaoPoo.hAssociacao.teste;

import estudo.cursoJava.javacore.introducaoPoo.hAssociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Messi");

        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};
        for (Jogador jogadore : jogadores) {
            jogadore.imprime();
        }

    }
}
