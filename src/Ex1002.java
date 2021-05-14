import java.util.Locale;
import java.util.Scanner;

/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2.
Considerando para este problema que π = 3.14159:

-Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada:
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída:
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo,
com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double).
Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
caso contrário, você receberá "Presentation Error".

Exemplos de Entrada       Exemplos de Saída:
r=2.00                    A=12.5664

r=100.64                  A=31819.3103

r=150.00                  A=70685.7750
 */


public class Ex1002 {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);

            Scanner scanner  = new Scanner(System.in);

            double pi = 3.14159;
            System.out.println("Digite o valor do raio: ");
            double raio = scanner.nextDouble();

            double area = pi * Math.pow(raio, 2.0);

            System.out.printf("A=%.4f", area);


            scanner.close();
        }
}

