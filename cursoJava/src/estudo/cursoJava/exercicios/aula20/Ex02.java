package estudo.cursoJava.exercicios.aula20;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
      //  Ex2 Gere e imprima uma matriz M 4x4 com valores aleatorios entre 0-9. Após isso determine o maior
//      número da matriz e a sua posição(linha,coluna)
        int [][] numerosAleatorios = new  int[4][4];
        Random numeroRandom = new Random();
        for (int i = 0; i < numerosAleatorios.length ; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maior = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < numerosAleatorios.length ; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if(numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    row = i;
                    col = j;

                }
            }
        }

        for (int i = 0; i < numerosAleatorios.length ; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.println(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

//        for (int[] numerosAleatorio : numerosAleatorios) {
//        System.out.println("teste " +numerosAleatorio );
//            for (int i : numerosAleatorio) {
//                System.out.println(i + " ");     }         System.out.println();
//      }

        System.out.println("Maior valor = " + maior);
        System.out.println("linha = " + row);
        System.out.println("Coluna = " + col);
    }
}
