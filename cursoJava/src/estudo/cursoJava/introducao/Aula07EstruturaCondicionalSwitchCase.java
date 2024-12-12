package estudo.cursoJava.introducao;

public class Aula07EstruturaCondicionalSwitchCase {
    public static void main(String[] args) {
        // imprima o dia da semana,considerando 1 como domingo

        int day = 1;
        switch (day){
            case 1:
                System.out.println(day + " É domingo");
                break;
            case 2:
                System.out.println(day + " É segunda");
                break;
            case 3:
                System.out.println(day + " É terça");
                break;
                case 4:
                System.out.println(day + " É quarta");
                break;
            case 5:
                System.out.println(day + " É quinta");
                break;
            case 6:
                System.out.println(day + " É Sexta");
                break;
            case 7:
                System.out.println(day + " É Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }
    }
}
