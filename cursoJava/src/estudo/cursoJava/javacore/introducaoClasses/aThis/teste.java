package estudo.cursoJava.javacore.introducaoClasses.aThis;

public class teste {
    public static void main(String[] args) {

        // Criando um objeto usando o primeiro construtor
        Book book1 = new Book("Senhor dos anéis", "J.R.R Tolkien", 1954);
        // Criando um objeto usando o segundo construtor
        Book book2= new Book("1984", "George Orwell");
        // Exibindo os detalhes dos livros

        System.out.println("Detalhes do livro 1: ");
        book1.exibirDetalhes();
        System.out.println("\nDetalhes do livro 2: ");
        book2.exibirDetalhes();
    }
}



























