package estudo.cursoJava.introducao;

public class Aula11Arrays02 {
    public static void main(String[] args) {
        //inicialização padrão dos tipos:
        //byte,short, int,long, float e edouble o valor é 0
        //char é um espaço em branco
        //boolean é false
        //tipos reference é null


        String [] nomes = new String[3];
      nomes[0] = "Alecs";
      nomes[1] = "João";
      nomes[2] = "Maria";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
