package estudo.cursoJava.introducao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ManupulandoStrings {
    public static void main(String[] args) {
//        String x = "Olá mundo, esse é o novo mundo!";
//        System.out.println(x.length()); //pega o  tamanho da string
//        System.out.println(x.contains("novo"));
//        System.out.println(x.indexOf("mundo"));
//        System.out.println(x.lastIndexOf("mundo"));
//        System.out.println(x.toUpperCase()); // coloca em caixa alta
//        System.out.println(x.trim()); //remove espaços desnecessários
//        System.out.println(x.substring(9)); //ler a string a partir do índice 9
//
//        // COMPARANDO STRING
//

        // == NÃO COMPARA O CONTEUDO, ELE COMPARA A REFERENCIA DOS OBJT EM MEMORIA
        // System.out.println(password == pass);

        String z = "123456"; //00010
        String y = "123456";//00010

        System.out.println(z == y); //está comparando a referencia
        //para comparar o valor usamos o equals
        String password = "123456";
        System.out.println("Digite a sua senha: ");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine(); //0100
        System.out.println(password.equals(pass));

    }
}
