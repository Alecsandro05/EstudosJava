package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo2.heranca.desafioExtra.dominio;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada){
        super(marca, modelo,ano);
        this.cilindrada = cilindrada;
    }
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cilindradas: " + this.cilindrada);
    }

}
