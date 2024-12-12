package estudo.cursoJava.introducao;

public class Aula08EstruturaDeRepeticao {
    public static void main(String[] args) {
        int count = 0;
        //while = enquanto
//        while (count < 10){
//            count++;
//            System.out.println(count);
//
//        }
//        boolean temMusica = true;
//
//        do {
//            System.out.println("Estou dançando!");
//            temMusica = false; // a música para de tocar
//        } while (temMusica);


//        for(int i = 0; i <= 10; i++){
//            System.out.println(i * 2);
//        }

        //UTILIZANDO O BREAK
        //imprima os primeiros 25 números de um dado valor
        int value = 50;
        for (int i = 0; i <= value; i++) {
            if(i > 25)  break;

            System.out.println("i = " + i);
        }
    }
}
