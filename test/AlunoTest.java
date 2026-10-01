package flamingo.aprendendo.basico.test;

import flamingo.aprendendo.basico.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] arg) {
        Aluno aluno01 = new Aluno();

        aluno01.nome = "Raquel";
        aluno01.nota = 10;

        System.out.println("Aluno: " + aluno01.nome);
        System.out.println("Nota: " + aluno01.nota);
        System.out.println("Aprovada: " + aluno01.isAprovado());
        System.out.println(aluno01.verificarConvite());
    }
}
