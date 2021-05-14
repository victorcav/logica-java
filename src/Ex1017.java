import java.util.Locale;
import java.util.Scanner;

/*
Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem,
ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através
de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas)
e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e,
em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

Entrada
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e
o segundo é a velocidade média durante a mesma (em km/h).

Saída
Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal

Exemplo de Entrada  	Exemplo de Saída
10                      70.833
85

2                       15.333
92

22                      122.833
67

 */

public class Ex1017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int consumo = 12;

        System.out.println("Tempo gasto na viagem (em horas): ");
        int tempo = scanner.nextInt();

        System.out.println("Velocidade média durante a mesma (em km/h): ");
        int velocidade = scanner.nextInt();

        double distancia = tempo * velocidade;

        double litros = distancia / consumo;

        System.out.printf("%.3f%n", litros);

        scanner.close();

    }
}
