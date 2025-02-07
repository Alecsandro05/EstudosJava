package estudo.cursoJava.javacore.introducaoPoo.aClass;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        contato1.nome = "João";
        contato1.endereco = "Av Paulista, 145";
        contato1.email = "Joao@email.com";
        contato1.telefones = new String[5];
        contato1.telefones[0] = "1234-4321";
        contato1.telefones[1] = "4567-7654";

        System.out.println(contato1.nome);
    }
}
