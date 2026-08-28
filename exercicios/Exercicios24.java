package flamingo.aprendendo.basico.flamingo.aprendendo.exercicios;

public class Exercicios24 {
    public static void main(String []args) {
        double temperatura = 80;
        String clima;

        if (temperatura <= 15) {
            clima = "Frio";
        } else if (temperatura <= 25){
            clima = "Agradável";
        } else if (temperatura <= 35) {
            clima = "Quente";
        } else {
            clima ="Muito quente";
        }

        System.out.println(clima);

    }

}

