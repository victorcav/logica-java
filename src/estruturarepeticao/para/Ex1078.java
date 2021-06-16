package estruturarepeticao.para;

import java.util.Scanner;

public class Ex1078 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();
        System.out.printf("TABUADA DO %d %n", n);

        for(int i = 1; i <= 10; i++){

            int resultado = n * i;
            System.out.printf("%d X %d = %d%n",i, n, resultado);

        }

        scanner.close();
    }
}
