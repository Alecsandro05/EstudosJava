package estudo.cursoJava.javacore.introducaoClasses.exerciciosClasse.BibliotyecaDeLivros;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<Livro>();
    void adicionarLivro(Livro livro){
       livros.add(livro);
    }
    public Livro buscarLivroPorTitulo(String titulo){
        for(Livro livro : livros){
            if(livro.getDetalhes().equalsIgnoreCase(titulo)){ //Comparamos o título do livro atual com o título procurado,
                // ignorando maiúsculas e minúsculas com equalsIgnoreCase()
                return livro;
            }
        }
      return null;
        
    }
    public void listarLivrosDisponiveis(){
        for(Livro livro : livros){
            if(livro.disponivel){
                System.out.println(livro.getDetalhes());
            }
        }
    }
}
