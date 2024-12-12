package estudo.cursoJava.introducao;

/*
 Teste de Velocidade
Escreva um programa em JAVA que permita inserir o nome e a velocidade de dois veículos e
exiba na tela uma mensagem dizendo qual dos dois é mais rápido
(ou que as velocidades são iguais se este for o caso)
---------------------------------------------------------------------------------------------------------------
Cálculo de Dano
Escreva um programa que permita inserir o nome e o poder de ataque de um personagem,
depois o nome, a quantidade de pontos de vida, o poder de defesa de outro personagem e se ele possui um escudo,
 e então calcule a quantidade de dano causado baseado nas seguintes regras:
 1 - Se o poder de ataque for maior do que a defesa e o defensor não possuir um escudo,
 o dano causado será igual a diferença entre o ataque e a defesa.
2- Se o poder de ataque for maior do que a defesa e o defensor possuir um escudo,
o dano causado será igual a metade da diferença entre o ataque e a defesa.
3- Se o poder de ataque for menor ou igual a defesa, o dano causado será 0.
4 - Por fim, o programa deve subtrair a quantidade de dano, da quantidade de pontos de vida do personagem defensor
 e exibir na tela a quantidade de dano e as informações atualizadas de ambos os personagens.
 */

public class Aula06EstruturasCondicionaisExercicios {
    public static void main(String[] args) {
        int damageCaused = 0;
        String attacker = "Naruto";
        int attackPower = 90;

        String defender = "goku";
        int pointsLife = 2000;
        int defensePower = 20;
        boolean shield = false;
        if(attackPower > defensePower && shield == false){
            damageCaused = attackPower - defensePower;
        }else if(attackPower > defensePower && shield == true){
            damageCaused = (attackPower - defensePower) / 2;

        } else if (attackPower <= defensePower) {
            damageCaused = 0;
        }
        pointsLife -= damageCaused;
        String infos = "Atacante: " + attacker + "\nPoder de ataque: " + attackPower + "\n\nDefensor: " + defender + "\nPode de defesa"
        + "\nPossui escudo: " + shield ;
        System.out.println(infos);
        System.out.println("------------GUERRAA--------------");
        String AfterTheWAR = "O " + attacker + " causou " + damageCaused + " pontos de dano em " + defender
                + "\n\n" + attacker + "\nPoder de ataque: " + attackPower + "\n\n" + defender + "\nPontos de vida: " + pointsLife
                + "\nPoder de defesa: " + defensePower + "\nPossui escudo: " + shield;
        System.out.println(AfterTheWAR);

        System.out.println("*********TESTE DE VELOCIDADE****************");
        String nameCar1 = "Lancer";
        String nameCar2 = "Civic g8";
        int velocityCar1 = 280;
        int velocityCar2 = 280;
        if(velocityCar1 > velocityCar2){
            System.out.println(nameCar1 + " é mais rápido que o " + nameCar2);
        }else if(velocityCar2 > velocityCar1){
            System.out.println(nameCar2 + " é mais rápido que o " + nameCar1);
        }else{
            System.out.println("O " + nameCar1 + " Tem a mesma velocidade que o " + nameCar2);
        }
    }
}
