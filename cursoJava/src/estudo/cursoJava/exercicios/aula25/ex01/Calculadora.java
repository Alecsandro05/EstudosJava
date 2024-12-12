//5 Exercícios para Praticar Métodos em Java
//Excelente iniciativa! A prática é fundamental para consolidar o aprendizado. Vamos aos exercícios:
//
//Exercício 1: Calculadora Simples
//Crie uma classe Calculadora com métodos para realizar as quatro operações básicas
// (soma, subtração, multiplicação e divisão).
//Cada método deve receber dois números como parâmetros e retornar o resultado da operação.
//Adicione um método para verificar se um número é par.

package estudo.cursoJava.exercicios.aula25.ex01;

public class Calculadora {
    public boolean ePar(int num){
        return num % 2 == 0;
    }
  public int soma(int a, int b){
      return a + b;
  }

  public int subtraction(int a, int b){
      return  a - b;
  }
  public int multi(int a, int b){
        return  a * b;
  }
  public int divisao(int a, int b){
        return  a / b;
    }
}
