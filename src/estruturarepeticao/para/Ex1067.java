package estruturarepeticao.para;

/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

Exemplo de Entrada:	    Exemplo de Saída:
8                       1
                        3
                        5
                        7


 */

import java.util.Scanner;

public class Ex1067 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int x = scanner.nextInt();

        if(x >= 1 && x <= 1000) {
            for (int i = 1; i <= x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
