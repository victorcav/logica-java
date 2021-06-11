package estruturarepeticao.enquanto;

/*
    Outra resolução do problema:

     * Faça um programa para ler um número indeterminado de dados, contendo cada um, a
     * idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor
     * de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for
     * entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
     * <p>
     * Entrada          Saida
     * 31               34.67
     * 27
     * 46
     * -5

    public class CalculaMediaEnquanto {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);

            int idade = scanner.nextInt();
            int soma = 0;
            int count = 0;

            while (idade >= 0) {
                soma += idade;
                count++;
                idade = scanner.nextInt();
            }

            if (count > 0) {
                double media = (double) soma / count;
                System.out.printf("%.2f%n", media);
            }else{
                System.out.printf("Impossivel de calcular");
            }


            scanner.close();
        }
    }
 */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSala {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        double media = 0.0;
        int cont = 0;

        if(idade < 0){

            System.out.println("impossivel calcular");

        }else {

            while (idade >= 0) {

                cont++;
                media += idade;

                idade = scanner.nextInt();
            }

            media /= cont;

            System.out.printf("%.2f%n", media);

        }

        scanner.close();
    }
}
