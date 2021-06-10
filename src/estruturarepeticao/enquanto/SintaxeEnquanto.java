package estruturarepeticao.enquanto;

/*
    Escrever um programa que leia numeros inteiros até que seja digitado o numero zero.
    Ao final somar todos os numeros digitados.
 */

import java.util.Scanner;

public class SintaxeEnquanto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int soma = 0;

        while (numero != 0){
            soma += numero;
            System.out.println(numero);
            numero = scanner.nextInt();

        }

        System.out.printf("SOMA = %d%n", soma);

        scanner.close();

    }
}
