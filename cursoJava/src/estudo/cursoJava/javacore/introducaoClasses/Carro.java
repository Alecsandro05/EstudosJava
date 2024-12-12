package estudo.cursoJava.javacore.introducaoClasses;

public class Carro {
   String marca;
   String modelo;
   int ano;
   String cor = "White";

   public Carro(){
      System.out.println("Carro Criado!");
   }

   public  Carro(String marca, String modelo){
         this.marca = marca;
         this.modelo = modelo;
   }

   public Carro(String marca,String modelo, int ano, String corCarro){
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
      this.cor = corCarro;


   }
   @Override
   public String toString() {
      return "Carro {" +
              "marca='" + marca + '\'' +
              ", modelo='" + modelo + '\'' +
              ", ano=" + ano +
              ", cor='" + cor + '\'' +
              '}';
   }

}
