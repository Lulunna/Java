package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios023 {
    public static void main(String []args) {
        double salario = 1006.0;
        String dinheiro;

        if (salario <= 1500) {
            dinheiro = "Salário baixo";
        } else if (salario <= 3000){
            dinheiro = "Salário médio";
        } else if (salario <= 7000) {
            dinheiro = "Salário bom";
        } else {
            dinheiro ="Salário alto";
        }

        System.out.println(dinheiro);

    }

}

