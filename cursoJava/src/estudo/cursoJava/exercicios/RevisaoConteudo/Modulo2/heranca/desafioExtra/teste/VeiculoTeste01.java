package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo2.heranca.desafioExtra.teste;

import estudo.cursoJava.exercicios.RevisaoConteudo.Modulo2.heranca.desafioExtra.dominio.Carro;
import estudo.cursoJava.exercicios.RevisaoConteudo.Modulo2.heranca.desafioExtra.dominio.Moto;

public class VeiculoTeste01 {
    public static void main(String[] args) {
        Moto moto = new Moto("Yamaha", "Ténéré 250", 2024, 600);
        moto.exibirDados();
        System.out.println("--------------------");
        Carro carro = new Carro("volkswagen", "UP TSI", 2023, 4);
        carro.exibirDados();
    }
}
