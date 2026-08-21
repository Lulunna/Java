package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios026 {
    public static void main(String []args) {
        byte statusPedido = 1;
        String pedido;

        if (statusPedido == 1) {
            pedido = "Pedido recebido";
        } else if (statusPedido == 2) {
            pedido = "Pedido em preparação";
        } else if (statusPedido == 3) {
            pedido = "Pedido enviado";
        } else if (statusPedido == 4) {
            pedido ="Pedido entregue";
        } else {
            pedido ="Status inválido";
        }

        System.out.println(pedido);

    }

}

