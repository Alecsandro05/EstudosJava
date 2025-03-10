package estudo.cursoJava.exercicios.RevisaoConteudo.Modulo2.heranca;

public class TesteAnimal {
    public static void main(String[] args) {
      Animal meuDog = new Cachorro();
      Animal meuGato = new Gato();
      meuGato.fazerSom();
      meuDog.fazerSom();
    }
}
