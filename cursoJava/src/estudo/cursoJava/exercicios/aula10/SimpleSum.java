package estudo.cursoJava.exercicios.aula10;
// Leia dois valores inteiros, neste caso, as variáveis A e B.
// Depois disso, calcule a soma entre eles e atribua-a à variável SOMA. Escreva o valor desta variável.
public class SimpleSum {
    public static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {

             int num1 = 10;
             int num2 = 10;
             int result = soma(num1,num2);
        System.out.println("A soma é " + result);

        }
    }

