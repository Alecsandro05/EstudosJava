package estudo.cursoJava.introducao;

/*
 Prática

  Crie Variaveis para os campos descritos abaixo e entre <> e imprima a seguinte mensagem:
  Eu<nome>, morando no endereço <endereço>,
  confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Alecsandro Sales";
        String address = "Núcleo Bandeirante - DF";
        float salary = 2800.97F;
        String dataRecebimento = "05/05/2024";
        String relatorio = "Eu " + nome + ", morando no endereço: " + address + ", confirmo que recebi o salaário de " + salary + "$, na data de " + dataRecebimento;
        System.out.println(relatorio);
    }
}

