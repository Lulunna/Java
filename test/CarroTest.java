package flamingo.aprendendo.basico.test;

import flamingo.aprendendo.basico.dominio.Carro;
import flamingo.aprendendo.basico.dominio.ImpressoraCarro;

public class CarroTest {
    public static void main(String[]args){
        ImpressoraCarro impressora = new ImpressoraCarro();

        Carro carro1 = new Carro();

        carro1.nome = "Raquel";
        carro1.marca = "Corola";
        carro1.ano = 2026;
        carro1.velocidadeAtual = 100;

        impressora.imprimi(carro1);


    }
}
