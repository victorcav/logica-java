import java.util.Scanner;

public class CalculoImc {

    public  static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        //**ENTRADA DE DADOS**
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a seu peso: ");
        double peso = scanner.nextDouble();

        //**PROCESSAMENTO**
        double imc = peso / (altura * altura);

        //**SAIDA DE DADOS**
        System.out.println("Seu IMC é " + imc);

        scanner.close();


    }
}

