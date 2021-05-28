import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2.0);

        System.out.printf("Seu IMC = %.2f%n", imc);
        System.out.print("Resultado = ");

        if(imc < 18.5){
            System.out.println("Magreza");
        }else if(imc < 24.9){
            System.out.println("Normal");
        }else if(imc < 30){
            System.out.println("Sobrepeso");
        }else{
            System.out.println("Obesidade");
        }

        scanner.close();

    }
}
