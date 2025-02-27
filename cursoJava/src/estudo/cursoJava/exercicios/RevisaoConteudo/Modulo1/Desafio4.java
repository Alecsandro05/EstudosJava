package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo1;

//Crie um programa que receba a nota de um aluno e retorne:
//
//Aprovado (nota >= 7)
//Recuperação (nota entre 5 e 6.9)
//Reprovado (nota < 5)
public class Desafio4 {
    public static void main(String[] args) {
        int nota = 5;

        if(nota >= 7){
            System.out.println("Aluno aprovado!");
        }else if(nota >= 5 && nota <= 6.9){
            System.out.println("Aluno de recupeção");
        }else{
            System.out.println("Aluno reprovado");
        }
    }

}
