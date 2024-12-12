package estudo.cursoJava.exercicios.aula10;

public class SomarElementosArray {
    public static void main(String[] args) {
        //Dado um array de inteiros, some todos os seus elementos.
        int [] nums = {2,7,3,4,5};
        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//           sum +=nums[i];
//            System.out.println(sum);
//        }
//        System.out.println(sum);

        for(int i = 0; i<= 10;i++){
            if (i % 2 == 0) {
                System.out.println(i +     " é par, então "+ i + " * 2 == " + ( i *2));
            }else{
                System.out.println(i + " é impar, então "+ i + " + 3 == " + ( i +  3));
            }
        }
    }
}