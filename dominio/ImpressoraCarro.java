package flamingo.aprendendo.basico.dominio;

public class ImpressoraCarro {
    public void imprimi(Carro carro){
        System.out.println("Carro: " + carro.nome);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade: " + carro.velocidadeAtual + " Km/h");
        System.out.println("Multado? " + carro.isMultado());
        System.out.println(carro.verificador());
    }
}
