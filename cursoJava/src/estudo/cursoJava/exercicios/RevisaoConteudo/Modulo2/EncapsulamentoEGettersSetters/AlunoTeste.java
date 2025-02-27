package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo2.EncapsulamentoEGettersSetters;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Alecsandro", 8.6,7.0);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Média: " + aluno1.media());


    }
}
