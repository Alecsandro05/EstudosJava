package estudo.cursoJava.javacore.introducaoClasses.ModificadoresAcesso;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alecsandro");
        pessoa.setIdade(10);
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
//        pessoa.imprime();
    }
}
