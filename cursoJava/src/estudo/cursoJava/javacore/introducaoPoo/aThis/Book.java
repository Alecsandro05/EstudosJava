package estudo.cursoJava.javacore.introducaoPoo.aThis;

public class Book {
    String titulo;
    String autor;
    int anoPublicacao;

//2. Construtor principal: inicializa todos os atributos
    public Book(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo; // 'this' refere-se ao atributo da classe
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // 3. Construtor secundário: inicializa apenas título e autor
    public Book(String titulo, String autor){
        this(titulo,autor, 0);// Chama o construtor principal
    }

    // 4. Método para exibir os detalhes do livro
public void exibirDetalhes() {
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Ano de publicação: " + this.anoPublicacao);
}


}
