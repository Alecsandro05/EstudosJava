package estudo.cursoJava.javacore.introducaoClasses.gModificadorestatico.teste;

import estudo.cursoJava.javacore.introducaoClasses.gModificadorestatico.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("bmw",280);
        Carro carro2 = new Carro("Mercedez",290);
        Carro carro3 = new Carro("Honda Civic",230);
        Carro.velocidadeLimite = 180;

        carro1.imprime();
        carro2.imprime();
    }
}
