package estudo.cursoJava.javacore.introducaoPoo.hAssociacao.teste;

import estudo.cursoJava.javacore.introducaoPoo.hAssociacao.dominio.Escola;
import estudo.cursoJava.javacore.introducaoPoo.hAssociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor professor3 = new Professor("Yruka");
        Professor[] professores = {professor1,professor2,professor3};

        Escola escola = new Escola("Konoha");
        // a lista de profesores vai vir de forma externa
        //simulando uma chamada e recebemos a lista de profesores
        escola.setProfessores(professores);
        escola.imprime();
    }
}
