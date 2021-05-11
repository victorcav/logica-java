import java.util.Locale;

public class Formatacao {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        double x = 10.35784;
        System.out.print(x); // Imprimi o texto sem uma nova linha
        System.out.println(x); // Imprimi o texto com uma nova linha
        System.out.printf("%.2f%n", x); // Imprimi com uma nova formatacao
        System.out.printf("%.4f%n", x); // Imprimi com uma nova formatacao
    }
}
