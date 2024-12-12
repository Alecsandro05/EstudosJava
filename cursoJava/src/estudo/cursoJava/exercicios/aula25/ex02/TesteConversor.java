package estudo.cursoJava.exercicios.aula25.ex02;

public class TesteConversor {
    public static void main(String[] args) {
        Conversor converter = new Conversor();
        double celsius = converter.fahrenheitParaCelsius(20);
        double fahrenheit = converter.celsiusParaFahrenheit(40);
        System.out.println(celsius);
        System.out.println(fahrenheit);
    }
}
