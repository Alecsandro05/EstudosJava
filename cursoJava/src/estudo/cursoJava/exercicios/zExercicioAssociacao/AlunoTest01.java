package estudo.cursoJava.exercicios.zExercicioAssociacao;

import java.util.Arrays;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carrilho", 19);
        Seminario seminario1 = new Seminario("Entrada na area da ti");
        Seminario seminario2 = new Seminario("Como ter sucesso em ti");
        Seminario[] listaSeminarioss = {seminario1, seminario2};
        aluno.setSeminarios(listaSeminarioss);
        System.out.println(Arrays.toString(aluno.getSeminario()));
    }
}
