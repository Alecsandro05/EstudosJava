package estudo.cursoJava.javacore.introducaoPoo.hAssociacao.teste;

import estudo.cursoJava.javacore.introducaoPoo.hAssociacao.dominio.Jogador;
import estudo.cursoJava.javacore.introducaoPoo.hAssociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");

        Time time = new Time("Real Madrid");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
