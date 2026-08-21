package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios022 {
    public static void main(String []args) {
        double nota = 6;

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7){
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }

}

