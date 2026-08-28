package flamingo.aprendendo.basico.flamingo.aprendendo.exercicios;

public class Exercicios27 {
    public static void main(String []args) {
        byte codigoProduto = 10;
        String cod;

        if (codigoProduto == 1) {
            cod = "Eletrônico";
        } else if (codigoProduto == 2) {
            cod = "Alimento";
        } else if (codigoProduto == 3) {
            cod = "Roupa";
        } else if (codigoProduto == 4) {
            cod ="Livro";
        } else {
            cod ="Categoria inválida";
        }

        System.out.println(cod);

    }

}

