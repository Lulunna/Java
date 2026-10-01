package flamingo.aprendendo.basico.test;

import flamingo.aprendendo.basico.dominio.SomaDoisNumeros;

public class SomaDoisNumerosTest01 {
    public static void main(String[] args){
        SomaDoisNumeros somaDoisNumeros = new SomaDoisNumeros();

        int multiplica = somaDoisNumeros.somaDoisNumeros02(2,2) * 4;

        System.out.println(multiplica);
    }
}
