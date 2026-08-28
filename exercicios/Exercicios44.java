package flamingo.aprendendo.basico.flamingo.aprendendo.exercicios;

public class Exercicios44 {

        public static void main(String []args) {

            boolean contaAtiva = true;
            String emailCorreto = "raquel@gmail.com";
            String senhaCorreta = "1234";

            String emailDigitado = "admin@email.com";
            String senhaDigitada = "1234";

            String status;

            if (!emailDigitado.equals(emailCorreto) || !senhaDigitada.equals(senhaCorreta)) {
                status = "Dados inválidos";
            } else if (!contaAtiva) {
                status = "Conta bloqueada";
            } else {
                status = "Login realizado";
            }

            System.out.println(status);
        }
    }




