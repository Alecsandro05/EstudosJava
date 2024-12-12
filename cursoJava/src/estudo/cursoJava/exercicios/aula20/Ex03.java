package estudo.cursoJava.exercicios.aula20;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
 //       Ex3: gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9.
//            Após isso indique qual é o maior e o menor valor da linha 5
//          e qual é o maior e o menor valor da coluna 7
        int [][] numerosAleatorios = new  int[10][10];
        Random numeroRandom = new Random();
        for (int i = 0; i < numerosAleatorios.length ; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }


        for (int i = 0; i < numerosAleatorios.length ; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.println(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;
        for (int i = 0; i < numerosAleatorios[linha5].length ; i++) {
            if(numerosAleatorios[linha5][i] > maiorL5){
                maiorL5 = numerosAleatorios[linha5][i];
            } else if (numerosAleatorios[linha5][i] < menorL5) {
                menorL5 = numerosAleatorios[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);
        int maiorC7 = 0;
        int menorC7 = 101;
        int col7 = 7;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            if(numerosAleatorios[i][col7] > maiorC7){
                maiorC7 = numerosAleatorios[i][col7];
            } else if (numerosAleatorios[i][col7] < menorC7) {
                menorC7 = numerosAleatorios[i][col7];
            }
        }
        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);
    }
}