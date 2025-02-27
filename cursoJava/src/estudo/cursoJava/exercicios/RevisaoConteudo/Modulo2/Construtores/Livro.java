package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo2.Construtores;
//Desafio 2:
// Crie uma classe Livro com um construtor que receba título, autor e ano de publicação.
// Instancie um objeto e exiba seus dados.

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;


    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public  void info(){
        System.out.println("Nome: " + titulo + "\nautor: " + autor + "\nAno de publicação: " + anoPublicacao);
    }
}
