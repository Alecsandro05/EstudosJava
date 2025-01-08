package estudo.cursoJava.introducao;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Lendo_dados_teclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String question = scan.nextLine();
        if(question.charAt(0) == ' '){
            System.out.println("sim");
        }else {
            System.out.println("Não");
        }

    }
}
