import java.util.Locale;
import java.util.Scanner;

public class CalculaRetangulo {

    public static void main(String[] args) {


        double base = 5.0;

        double altura = 4.0;

        double perimetro = (2 * base) + (2 * altura);

        double area = base * altura;

        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.println("AREA = " + area);
        System.out.println("PERIMETRO = " + perimetro);
        System.out.printf("DIAGONAL = " + diagonal);


    }

}
