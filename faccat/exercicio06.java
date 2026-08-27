package flamingo.aprendendo.basico.faccat;

import java.util.Scanner;

public class exercicio06 {
    public static void main (String[] args) {

        double altura, base, area;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a base do retângulo");
        base = sc.nextDouble();

        System.out.printf("Digite a altura do retângulo");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("A área do retângulo = %.2f", area);

        sc.close();

    }
}
