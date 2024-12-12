package estudo.cursoJava.javacore.introducaoClasses.exerciciosClasse.BibliotyecaDeLivros;

public class Livro {
    String titulo;
    String autor;
    int anoPublicado;
    boolean disponivel;

    public  Livro(String titulo, String autor, int anoPublicado, boolean disponivel ){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.disponivel = disponivel;


    }
    public void emprestar(){
        this.disponivel = false;
    }
    public void devolver(){
        this.disponivel = true;
    }

    public String getDetalhes(){
        return "Título: " + titulo + "\n Autor:  " + autor + "\nAno: " +
                anoPublicado + "\nDisponivel: " + (disponivel ? "Sim" : "Não");
    }
}
