package estudo.cursoJava.exercicios.aula27.ex06;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] jogVelha = new char[3][3];
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;
        while (!ganhou){
            if(jogada % 2 == 1){
                System.out.println("Vez do Jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            }else{
                System.out.println("Vez do Jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';

            }
            boolean linhaValida = false;
            while (!linhaValida){
                System.out.println("Entre com a linha (1,2 ou 3): ");
            linha = scan.nextInt();
            if(linha >= 1 && linha <=3){
                linhaValida = true;
            }else{
                System.out.println("Entrada inválida, tente novamente!");

            }
            }
            boolean colunaValida = false;
            while (!colunaValida){
                System.out.println("Entre com a coluna (1,2 ou 3): ");
                coluna = scan.nextInt();
                if(coluna >= 1 && coluna <=3){
                    colunaValida = true;
                }else{
                    System.out.println("Entrada inválida, tente novamente!");

                }
            }
            linha--;
            coluna--;
            if(jogVelha[linha][coluna] == 'X' ||jogVelha[linha][coluna] == 'O'){
                System.out.println("Posição já usada, tente novamente");
            }else{
                jogVelha[linha][coluna] = sinal;
                jogada++;
            }

            for (int i = 0; i < jogVelha.length; i++) {
                for (int j = 0; j < jogVelha[i].length; j++) {
                    System.out.println(jogVelha[i][j] + " | ");
                }
                System.out.println();
            }
            if((jogVelha[0][0] == 'X'  && jogVelha[0][1] == 'X' && jogVelha[0][2] == 'X') || //linha 1
                    (jogVelha[1][0] == 'X'  && jogVelha[1][1] == 'X' && jogVelha[1][2] == 'X') || // linha 2
                    (jogVelha[2][0] == 'X'  && jogVelha[2][1] == 'X' && jogVelha[2 ][2] == 'X') || //linha 3
                    (jogVelha[0][0] == 'X'  && jogVelha[1][0] == 'X' && jogVelha[2][0] == 'X') ||//coluna 1
                    (jogVelha[0][1] == 'X'  && jogVelha[1][1] == 'X' && jogVelha[2][1] == 'X') ||//coluna 2
                    (jogVelha[0][2] == 'X'  && jogVelha[1][2] == 'X' && jogVelha[2][2] == 'X') ||//coluna 3
                    (jogVelha[0][0] == 'X'  && jogVelha[1][1] == 'X' && jogVelha[2][2] == 'X') // diagonal
            ){
                ganhou = true;
                System.out.println("Parabens, Jogador 1 ganhou!");

            }else if((jogVelha[0][0] == 'O'  && jogVelha[0][1] == 'O' && jogVelha[0][2] == 'O') || //linha 1
                    (jogVelha[1][0] == 'O'  && jogVelha[1][1] == 'O' && jogVelha[1][2] == 'O') || // linha 2
                    (jogVelha[2][0] == 'O'  && jogVelha[2][1] == 'O' && jogVelha[2 ][2] == 'O') || //linha 3
                    (jogVelha[0][0] == 'O'  && jogVelha[1][0] == 'O' && jogVelha[2][0] == 'O') ||//coluna 1
                    (jogVelha[0][1] == 'O'  && jogVelha[1][1] == 'O' && jogVelha[2][1] == 'O') ||//coluna 2
                    (jogVelha[0][2] == 'O'  && jogVelha[1][2] == 'O' && jogVelha[2][2] == 'O') ||//coluna 3
                    (jogVelha[0][0] == 'O'  && jogVelha[1][1] == 'O' && jogVelha[2][2] == 'O'))
            {
                ganhou = true;
                System.out.println("Parabens, Jogador 2 ganhou!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Empate!");
            }
        }

    }
}
