package estudo.cursoJava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
//        int idade = 20;
//        if (idade < 15) {
//            System.out.println("Categoria Infantil");
//        } else if(idade >= 15 && idade < 18) {
//            System.out.println("Categoria Juvenil");
//        }else{
//            System.out.println("Categoria Adulto");
//        }
        //operadotr ternario (condição) ? faça algo : faça outa coisa
        int idade = 18;
        String resultado = idade >= 18 ? "pode tirar a carteira" : "Não pode tirar a carteira";
        System.out.println(resultado);
  }

}
