package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios025 {
    public static void main(String []args) {
        int xp = 4000;
        String nivel;

        if (xp <= 1000) {
            nivel = "Iniciante";
        } else if (xp <= 4999){
            nivel = "Intermediário";
        } else if (xp <= 9999) {
            nivel = "Avançado";
        } else {
            nivel ="Lendário";
        }

        System.out.println(nivel);

    }

}

