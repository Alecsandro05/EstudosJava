package estudo.cursoJava.javacore.introducaoClasses.SobrecargaDeContrutores.dominio;

public class Serie {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Serie(String nome, String tipo, int episodios, String genero) {
        this(); // faz a sobrecarga de construtores.
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

    }

    public Serie(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero); // faz a sobrecarga de construtores.

        this.estudio = estudio;
    }

    public Serie() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }


    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String teste) {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

}
