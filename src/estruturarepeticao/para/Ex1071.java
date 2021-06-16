package estruturarepeticao.para;

/*
        Soma de Impares Consecutivos I

        Leia 2 valores inteiros X e Y.
        A seguir, calcule e mostre a soma dos números impares entre eles.

        Entrada
        O arquivo de entrada contém dois valores inteiros.

        Saída
        O programa deve imprimir um valor inteiro.
        Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na
        entrada que deverá caber em um inteiro.

        Exemplo de Entrada              	Exemplo de Saída
        6                                   5
        -5

        15                                  13
        12

        12                                  0
        12

*/

import java.util.Scanner;

public class Ex1071 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int soma = 0;
        int maior, menor;

        if(x < y){
            menor = x;
            maior = y;
        }else{
            menor = y;
            maior = x;
        }

        for(int i = menor + 1; i < maior; i++){
            if(i % 2 != 0) {
                soma += i;
            }
        }

        System.out.printf("Soma = %d%n", soma);

        scanner.close();
    }
}
