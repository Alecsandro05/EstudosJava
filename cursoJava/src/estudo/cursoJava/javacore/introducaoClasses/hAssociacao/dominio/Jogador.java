package estudo.cursoJava.javacore.introducaoClasses.hAssociacao.dominio;

public class Jogador {
    private  String nome;

    public  void imprime(){
        System.out.println("Jogador: " + this.nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}