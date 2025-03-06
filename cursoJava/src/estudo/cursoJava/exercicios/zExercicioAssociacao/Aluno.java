package estudo.cursoJava.exercicios.zExercicioAssociacao;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario[] seminarios;
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }



}
