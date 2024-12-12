package estudo.cursoJava.exercicios.aula25.ex01;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        int soma = cal.soma(5,2);
        System.out.println("Soma é: " + soma + "\n");

        int sub = cal.subtraction(5,2);
        System.out.println("A Subtração é: " + sub + "\n");

        int multi = cal.multi(5,2);
        System.out.println("Soma é: " + multi + "\n");

        int divisao = cal.divisao(5,2);
        System.out.println("A divisão é: " + divisao + "\n");

        boolean par = cal.ePar(4);
        System.out.println(par);
    }
}
