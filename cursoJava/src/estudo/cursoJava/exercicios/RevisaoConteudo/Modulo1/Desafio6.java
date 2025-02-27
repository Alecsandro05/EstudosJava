package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Desafio6 {
    public static void main(String[] args) {
//        System.out.println("-------ARRAY SIMPLES-------");
//        int[] numeros = {10,12,45};
//        System.out.println(numeros);
//        for(int num : numeros) System.out.println(num);
//        System.out.println("-------ArraylIST(COLECOES)----");
//
//        ArrayList<String> nomes = new ArrayList<>();
//        nomes.add("Alecsandro");
//        nomes.add("Lara");
//        System.out.println(nomes);

// Crie um programa que armazene 5 nomes em um ArrayList e os exiba em ordem alfabética.
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Alecsandro");
        nomes.add("Lara");
        nomes.add("Joao");
        nomes.add("Windersson");
        nomes.add("Igor");
        Collections.sort(nomes);

        System.out.println("Nomes em ordem alfabetica: " + "\n" + nomes);
        for (String nome : nomes) System.out.println(nome);
    }
}
