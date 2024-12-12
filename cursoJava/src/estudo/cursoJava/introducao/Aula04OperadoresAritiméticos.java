package estudo.cursoJava.introducao;


public class Aula04OperadoresAritiméticos {
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 20;
        int resultado = numero1 + numero2;
       // System.out.println(resultado);

        //%
        int resto = 20 % 2; // resto: 0
        System.out.println(resto);

        // maior e menor <> ; menor igual <= e maior igual >=; comparação ==; diferente !=; (sempre retornam valores booleanos

      boolean isDezMaiorQueVinte = 10 > 20;
      boolean isDezMenorQueVinte = 10 < 20;
      boolean isDezIgualDez = 10 == 10;
      boolean isDezIgualVinte = 10 == 20;
      boolean isDiferenteDez = 10 != 20;
        System.out.println("IsDezMairQueDez " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDiferenteDez " + isDiferenteDez);

        //&& (AND) || (Or) ! (NOT)
        int idade = 18;
        float salario = 1800F;
        boolean dentroDaLei = idade >= 18 && salario >=1800;
        boolean foraDaLei =  idade < 15 && salario <= 1800;
        System.out.println("Dentro da lei : " + dentroDaLei);
        System.out.println("Fora da lei : " + foraDaLei);

        // = += -= *= /= %=
        int trocado = 20;
        trocado = 60; // trocado recebe agr 60

        int trocado2 = 50;
        trocado2 += 20; // pega os 50 e adiciona + 20

        System.out.println(trocado2);

    }
}
