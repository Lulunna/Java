package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios028 {
    public static void main(String []args) {
        byte plano = 2;
        String plan;

        if (plano == 1) {
            plan = "Plano Básico - R$ 29,90";
        } else if (plano == 2) {
            plan = "Plano Intermediário - R$ 59,90";
        } else if (plano == 3) {
            plan = "Plano Premium - R$ 99,90";
        } else  {
            plan ="Plano inválido";
        }

        System.out.println(plan);

    }

}

