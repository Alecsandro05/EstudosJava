package estudo.cursoJava.javacore.introducaoClasses.bVarAgrs;

public class Calculadora {
    public static int somar(int... numeros){
    int soma = 0;
    for(int numero : numeros){
    soma += numero;
    }

        return soma;
    }

    public static void main(String[] args) {
        System.out.println(somar(1,2,3,2,6));
    }
}
