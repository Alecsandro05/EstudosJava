package estudo.cursoJava.exercicios.ContaBanco.ContaTerminal;

import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo(a) ao banco TESTE");
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println();
       int  agencia = 12356;
       String conta = " ";
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            conta += random.nextInt(10);
        }


    }
}
