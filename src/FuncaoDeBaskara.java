import java.util.Locale;
import java.util.Scanner;

public class FuncaoDeBaskara {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = (Math.pow(b, 2.0)) - (4*a*c);

        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.printf("O valor de delta é: %f%n", delta);
        System.out.printf("O valor de X1 é: %f%n", x1);
        System.out.printf("O valor de X2 é: %f%n", x2);

        scanner.close();

    }
}
