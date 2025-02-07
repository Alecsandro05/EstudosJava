package estudo.cursoJava.exercicios.zExercicioAssociacao;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Brasilia");
        Aluno aluno = new Aluno("Alecsandro Sales", 19);
        Professor professor = new Professor("Jorge", "Back-end");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Programação orientada a objetos",alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
