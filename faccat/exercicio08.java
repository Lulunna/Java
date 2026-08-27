package flamingo.aprendendo.basico.faccat;

import java.util.Scanner;

public class exercicio08 {
    public static void main (String[] args) {

        int brancos, nulos, validos, totalEleitores ;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o total de eleitores");
        totalEleitores = sc.nextInt();

        System.out.printf("Digite os votos brancos");
        brancos = sc.nextInt();

        System.out.printf("Digite os votos nulos ");
        nulos = sc.nextInt();

        System.out.printf("Digite os votos validos ");
        validos = sc.nextInt();


        System.out.printf("Porcentual brancos: %d%%\n", (brancos * 100) / totalEleitores);
        System.out.printf("Porcentual nulos: %d%%\n", (nulos * 100) / totalEleitores);
        System.out.printf("Porcentual validos: %d%%\n", (validos * 100) / totalEleitores);


        sc.close();

    }
}
