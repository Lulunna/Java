package flamingo.aprendendo.introducao;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // byte : -128 a 127
        // short : -32.768 a 32.767
        // int : -2 bilhões a 2 bilhões
        // long : Para números inteiros muito grandes (usa um L no final do número)
        // float : Precisão simples (usa F no final)
        // double : Precisão dupla, o padrão para decimais no Java
        // char : Guardar uma única letra ou símbolo em formato Unicode (ex: 'A')
        // boolean : Guardar apenas dois valores: true ou false
        byte idade = 24;
        int municipio = 2000000;
        long contaBancaria = 77777777778945254L;
        float salario = 10000.99F;
        double salarioExtra = 25000.50;
        char primeiraLetraDoNome = 'R';
        boolean vaiEstudarNasFerias = true;
        System.out.println("Minha idade é " + idade );
        System.out.println("São Paulo, tem mais de: " + municipio + " cidadões");
        System.out.println("Minha conta bancaria daqui 10 ano, tera: " + contaBancaria + " de dinheiro");
        System.out.println("Meu salario é: R$" + salario);
        System.out.println("PL caiu = " + salarioExtra);
        System.out.println("A primeira letra do meu nome é: " + primeiraLetraDoNome);
        System.out.println("Vai estudar nas ferias ?" + vaiEstudarNasFerias);

    }
}




