package estudo.cursoJava.javacore.introducaoClasses.exerciciosClasse.Funcionario;

import java.util.Arrays;

public class Funcionario {
    String nome;
    int idade;
    double[] salarios;

    public void imprimirDados() {

        System.out.println(this.nome);
        System.out.println(this.idade);
        int count = 1;
        if (salarios == null) {
            return;
        }

            for (double salario : salarios) {
                System.out.println(count + "º Salario: " + salario);
                count++;
            }


        averageSalary();

    }

    public void averageSalary() {
        if (salarios == null) {
            return;
        }
        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        double avarage = soma / salarios.length;
        System.out.printf("A média de salários é de: %.3f", avarage);
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Alecs";
        funcionario1.idade = 19;
        funcionario1.salarios = new double[]{400,800,1400};
        funcionario1.imprimirDados();

    }
}
