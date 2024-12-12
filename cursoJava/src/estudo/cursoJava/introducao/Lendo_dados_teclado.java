package estudo.cursoJava.introducao;


import java.util.Scanner;

public class Lendo_dados_teclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Digite seu nome completo:");
//        String nomeCompleto = scan.nextLine();
//        System.out.println("Seu nome completo é " + nomeCompleto);
//
//        System.out.println("Digite seu primeiro nome :");
//        String primeiroCompleto = scan.next();
//        System.out.println("Seu primeiro nome é " + primeiroCompleto);

        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

    }
}
