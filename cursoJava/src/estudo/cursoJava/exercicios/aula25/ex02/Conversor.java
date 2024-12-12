//Exercício 2: Conversor de Temperaturas
//Crie uma classe Conversor com métodos para converter temperaturas entre Celsius e Fahrenheit.
//As fórmulas são:
//Celsius para Fahrenheit: F = (C * 9/5) + 32
//Fahrenheit para Celsius: C = (F - 32) * 5/9

package estudo.cursoJava.exercicios.aula25.ex02;

public class Conversor {
    public  double fahrenheitParaCelsius(double temperaturaCelsius){
        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        return temperaturaFahrenheit;
    }
    public  double celsiusParaFahrenheit (double temperaturaFahrenheit){
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5/9;
        return temperaturaCelsius;
    }
}
