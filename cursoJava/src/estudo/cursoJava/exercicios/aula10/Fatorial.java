package estudo.cursoJava.exercicios.aula10;

public class Fatorial {
    public static void main(String[] args) {
//        Fatorial de um Número
//        Crie um programa que calcule o fatorial de um número dado (por exemplo, 5! = 5 * 4 * 3 * 2 * 1)
        int num = 5;
        int fatorial = 1;
        for (int i = 1; i <= num; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é " + fatorial);
    }
}
