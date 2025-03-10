package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo2.heranca.desafioExtra.dominio;

public class Carro extends  Veiculo{
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }



   public void exibirDados(){
        super.exibirDados();
       System.out.println("Portas: " + this.quantidadeDePortas);
    }

}
