package flamingo.aprendendo.basico.flamingo.aprendendo.exercicios;

public class Exercicios30 {
    public static void main(String []args) {
        double imc = 22.5;
        String peso;

        if (imc < 1) {
            peso = "Abaixo do peso";
        } else if (imc <= 2) {
            peso = "Peso normal";
        } else if (imc <= 3) {
            peso = "Sobrepeso";
        } else  {
            peso ="Obesidade";
        }
        
        System.out.println(peso);

    }

}

