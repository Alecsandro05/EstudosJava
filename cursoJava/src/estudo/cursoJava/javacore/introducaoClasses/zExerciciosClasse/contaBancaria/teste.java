package estudo.cursoJava.javacore.introducaoClasses.zExerciciosClasse.contaBancaria;

public class teste {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaBancaria conta1 = new ContaBancaria(123,"João");
        ContaBancaria conta2 = new ContaBancaria(456,"Neymar");

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(1000);
        conta2.depositar(670);

        ContaBancaria contaEncontrada = banco.buscarContaPorNumero(32);
        if(contaEncontrada != null){
            System.out.println("Conta encontrada: " + contaEncontrada.getNumeroConta());
        }else {
            System.out.println("Conta não encontrada");
        }
    }
}
