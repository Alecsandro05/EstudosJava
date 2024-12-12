package estudo.cursoJava.introducao;

public class Aula10Arrays01 {
    public static void main(String[] args) {
// o int [] idades é uma variaves de tipo reference
//arrays são considerados objetos na memoria, a variavels idades está fazendo referencia no objeto que é um array int
        int [] idades = new int[3];
        idades[0] = 10;
        idades[1] = 12;
        idades[2] = 13;
        System.out.println(idades[1]);
    }
}
