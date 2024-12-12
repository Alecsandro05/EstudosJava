package estudo.cursoJava.introducao;

public class Aula09EstruturaDeRepeticaoExerciciio {
    public static void main(String[] args) {
        //imprima todos os númeors pares de 0 até 1milhao
//        for(int i = 0; i <= 100; i++){
//            if (i % 2 == 0){
//                System.out.println(i + " é par");
//            }
//        }
        //Dado um valor de um caroo, descubra em quantas vzs ele podes ser parcelado
        //condição valorParcela >= 1000
        int valueCar = 40000;

        for (int parcela = 1; parcela <= valueCar ; parcela++) {
            int valorParcela = valueCar / parcela;
                    if(valorParcela < 1000) {
                        break;
                    }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
