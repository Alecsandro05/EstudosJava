package estudo.cursoJava.exercicios.aula20;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
//        EX1: Faça um programa que converta metros em centímetros
      Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor em metro:");
        int metros = scan.nextInt();
        int conversion = metros * 100;
        System.out.println(metros + " metros é igual a " + conversion + " centímetros");


    }
}
