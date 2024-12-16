package estudo.cursoJava.javacore.introducaoClasses.zExerciciosClasse.BibliotyecaDeLivros;

public class Teste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O senhor dos Anéis", "J.R.R Talkien", 1954, true);
        Livro livro2 = new Livro("1984", "George Orwell", 1949, false);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivrosDisponiveis();

        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("O senhor dos anéis");
        if(livroEncontrado != null){
            System.out.println("Livro encontrado: " + livroEncontrado.getDetalhes());
        }
    }

}
