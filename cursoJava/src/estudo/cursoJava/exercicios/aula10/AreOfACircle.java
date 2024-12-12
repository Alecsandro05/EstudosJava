package estudo.cursoJava.exercicios.aula10;
// A fórmula para calcular a área de uma circunferência é definida como A = π., R**.
// Considerando para este problema que π = 3,14159:
// Calcule a área utilizando a fórmula dada na descrição do problema.

public class AreOfACircle {

    public static void main(String[] args) {
        double pi = 3.14159F;
         float raio = 100.64f;
        double circleRaio = pi * (raio * raio);
        System.out.println(circleRaio);
    }
}
