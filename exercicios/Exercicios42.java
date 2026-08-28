package flamingo.aprendendo.basico.flamingo.aprendendo.exercicios;

public class Exercicios42 {
    public static void main(String []args) {
        double saldo = 50.0;
        double valorProduto = 100.0;
        boolean clienteVip = true;
        String status;


        if (saldo >= valorProduto){
            status = "Compra aprovada";
        }else if (clienteVip) {
            status = "Compra aprovada pelo crédito VIP";
        }else{
            status = "Compra recusada";
        }
        System.out.println(status);
   }
    }



