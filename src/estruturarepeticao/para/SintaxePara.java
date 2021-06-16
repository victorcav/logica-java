package estruturarepeticao.para;

/*
    Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int soma = 0;

        while(count != n){

            System.out.println("Digite um numero: ");
            int x = scanner.nextInt();
            count++;
            soma += x;

        }

        System.out.printf("Soma: %d%n", soma);

        scanner.close();
 */

import java.util.Scanner;

public class SintaxePara {

    /*


     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int soma = 0;

        for(int i = 0; i < n; i++){

            System.out.println("Digite um numero: ");
            int x = scanner.nextInt();
            soma += x;

        }

        System.out.printf("Soma: %d%n", soma);

        scanner.close();


    }
}
