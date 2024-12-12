package estudo.cursoJava.javacore.introducaoClasses.exerciciosClasse.contaBancaria;

import java.util.ArrayList;

public class Banco {
    ArrayList<ContaBancaria> contas = new ArrayList<>();

    public  void adicionarConta(ContaBancaria conta){
        contas.add(conta);
    }
    public ContaBancaria buscarContaPorNumero(int numero){
        for (ContaBancaria conta : contas){
       if(conta.getNumeroConta() == numero){
          return conta;
      }
        }
        return null;
    }

}
