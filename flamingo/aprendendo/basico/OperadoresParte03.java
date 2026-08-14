package flamingo.aprendendo.basico;

public class OperadoresParte03 {
    public static void main(String[] args){

        /*
        * && AND -> E
        * || OR ->
        * ! NOT -> NÃO
        */

        byte idade = 24;
        boolean isCNH = true;
        boolean isEstaNaLeiParaDirigir = idade >= 18 && isCNH;

        System.out.println(isEstaNaLeiParaDirigir);

    }

}
