package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo1;
//Desafio 5:
//Crie um programa que imprima os 10 primeiros números da sequência de Fibonacci.
//

public class Desafio5 {
    public static void main(String[] args) {
    int num = 10;
    int primeiro = 0, segundo = 1;

    for (int i = 0; i <= 10; i++){

        System.out.println(primeiro + " ");

        int proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;

    }
    }
}
