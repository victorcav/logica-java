import java.util.Locale;
import java.util.Scanner;

public class CalculaRetangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do retangulo: ");
        double base = scanner.nextDouble();

        System.out.println("Informe a altura do retangulo: ");
        double altura = scanner.nextDouble();

        double perimetro = (2 * base) + (2 * altura);

        double area = base * altura;

        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.println("----------------------------");
        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);
        System.out.println("----------------------------");

        scanner.close();
    }

}
