package flamingo.aprendendo.basico.flamingo.aprendendo.exercicios;

public class Exercicios23 {
    public static void main(String []args) {
        int tipoCliente = 3;
        double valorCompra = 100.0;

        if (tipoCliente == 1) {
            valorCompra = valorCompra * 1.00;
        } else if (tipoCliente == 2) {
            valorCompra = valorCompra * 0.95;
        } else if (tipoCliente == 3) {
            valorCompra = valorCompra * 0.90;
        } else if (tipoCliente == 4) {
            valorCompra = valorCompra * 0.85;
        }

        System.out.println(valorCompra);
    }
}

