package flamingo.aprendendo.basico.flamingo.aprendendo.exercicios;

public class Exercicios45 {

    public static void main(String []args) {

        double valorCompra = 350.0;

        double porcentagemDesconto;

        if (valorCompra <= 100) {
            porcentagemDesconto = 0.0;
        } else if (valorCompra <= 300) {
            porcentagemDesconto = 5.0;
        } else if (valorCompra <= 500) {
            porcentagemDesconto = 10.0;
        } else {
            porcentagemDesconto = 15.0;
        }

        double valorDesconto = valorCompra * (porcentagemDesconto / 100);
        double valorFinal = valorCompra - valorDesconto;

        String status = "Valor original: R$ " + valorCompra + " | Desconto: " + porcentagemDesconto + "%" +       " | Economia: R$ " + valorDesconto + " | Total: R$ " + valorFinal;

        System.out.println(status);
    }
}




