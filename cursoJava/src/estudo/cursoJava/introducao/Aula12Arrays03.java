package estudo.cursoJava.introducao;

public class Aula12Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        //segunda forma de inicializar um array
        int [] numeros2 = {1,2,3,};
        // 3º forma de inicializar um array
        int [] numeros3 = new int[]{1,2,3,};

//        for (int i = 0; i < numeros3.length ; i++) {
//            System.out.println(numeros3[i]);
//        }
// for each - não nos dá os indices
        for (int num : numeros3){
            System.out.println(num);
        }
    }
}
