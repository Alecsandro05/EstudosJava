package estudo.cursoJava.introducao;


//1- Iteração em uma Lista de Números Inteiros:
//Escreva um programa que declare uma lista de números inteiros. Utilize o loop foreach para iterar sobre essa lista e
//imprimir cada número no console.
//
// 2 - Cálculo da Média de Notas:
//Crie um programa que leia um array de notas de alunos (tipo double).
//Utilize o loop foreach para calcular e exibir a média dessas notas.
//
// 3 - Filtragem de Nomes:
//Implemente um programa que tenha uma lista de nomes (tipo String).
//Use o loop foreach para iterar sobre a lista e exibir apenas os nomes que começam com a letra "A".
public class Aula13ExercicosForEach {
    public static void main(String[] args) {
        //ex 1
//        int[] numerous = new int[]{1, 3, 4, 5,10};
//
//        for (int num : numerous){
//            System.out.println(num);
//        }
        //ex 2
//        double[] notasMedias = new double[]{6.8,9.5,5.7};
//        double soma = 0;
//        for (double nota : notasMedias){
//            soma +=nota;
//            System.out.println(soma);
//        }
//        double media = soma / notasMedias.length;
//        System.out.println("A média das notas é: " + media);

        //ex 3
        String[] nomes = new String[]{"Alecsandro", "João", "Leticia", "Maria", "Alan","Alice"};
        for (String nome : nomes){
            //startsWith("A") é utilizado para verificar se o nome começa com a letra "A".
            // Se a condição for verdadeira, o nome é exibido no console.
            if(nome.startsWith("A")){
                System.out.println(nome);
            }
        }

    }
}
