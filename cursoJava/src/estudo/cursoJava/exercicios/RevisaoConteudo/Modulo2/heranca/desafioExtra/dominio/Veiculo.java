package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo2.heranca.desafioExtra.dominio;

public class Veiculo {
    private String marca;
    private  String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public void exibirDados(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano
        );
    }
}
