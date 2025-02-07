package estudo.cursoJava.exercicios.zExerciciosClasse.contaBancaria;

public class ContaBancaria {
    int numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(int numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void sacar(double valor){
       if(valor > 0 && valor <= saldo){
            saldo -= valor;
           System.out.println("Saque realizado com sucesso");
       }else {
           System.out.println("Saldo insuficiente ou valor inválido");
       }
    };

    public void depositar(double valor){
       if (valor > 0){
           saldo += valor;
           System.out.println("Depósito realizado com sucesso!");
       }else {
           System.out.println("Valor inválido para depósito");
       }
    }

    public double getSaldo(){
        return  saldo;
    }
    public void transferir(ContaBancaria contaDestino, double valor){
        if(valor > 0 && saldo >= valor){
            saldo-= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferencia realizada com sucesso.");
        }else {
            System.out.println("Saldo insuficiente para realizar a transferência");
        }
    }
    public int getNumeroConta(){
        return numeroConta;
    }

}
