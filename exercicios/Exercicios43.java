package flamingo.aprendendo.basico.flamingo.aprendendo.exercicios;

public class Exercicios43 {
    public static void main(String []args) {
        int idade = 22;
        boolean temCarteirinhaEstudante = false;
        String status;

        if (idade >= 12 && temCarteirinhaEstudante) {
        status = "Estudantes pagam meia";
        } else if (idade < 12) {
        status = "Menores de 12 anos pagam meia";
        } else {
        status = "Adultos sem carteirinha pagam inteira";
        }

        System.out.println(status);
   }
    }



