package estudo.cursoJava.javacore.introducaoPoo.iHeranca.teste;

import estudo.cursoJava.javacore.introducaoPoo.iHeranca.dominio.Endereco;
import estudo.cursoJava.javacore.introducaoPoo.iHeranca.dominio.Funcionario;
import estudo.cursoJava.javacore.introducaoPoo.iHeranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("71710510");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alecsandro");
        pessoa.setCpf("09209090");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Joao");
        funcionario.setCpf("1234567891012");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        System.out.println("--------------");
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
