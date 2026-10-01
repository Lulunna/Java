package flamingo.aprendendo.basico.dominio;

public class Carro {
    public String nome;
    public String marca;
    public int ano;
    public double velocidadeAtual;

    public boolean isMultado() {return velocidadeAtual >= 80;}

    public String verificador (){
        if (isMultado()){
            return nome + " Seu carro foi multado";
        }
        return nome + "Dentro do limite";
    }
}

