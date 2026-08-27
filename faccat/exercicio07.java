package flamingo.aprendendo.basico.faccat;

import java.util.Scanner;

public class exercicio07 {
    public static void main (String[] args) {

        int idade, mes, dia, totalDias;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a idade que você tem");
        idade = sc.nextInt();

        System.out.printf("Digite o mês que você nasceu");
        mes = sc.nextInt();

        System.out.printf("Digite o dia que você nasceu");
        dia = sc.nextInt();

        totalDias = (idade * 365) + (mes * 30) + dia;

        System.out.printf("Você tem esses dias de vida: = %d", totalDias);

        sc.close();

    }
}
