import java.util.Locale;

public class Exec01 {

    public static void main (String[] args){

        // Entrada de Dados

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        // Saida de dados:

        System.out.println("Products: "); // Ok
        System.out.printf("%s, which price is $ %.2f%n", product1, price1); // Ok
        System.out.printf("%s, which price is $ %.2f%n", product2, price2); // Ok
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender); // Ok
        System.out.println();
        System.out.printf("Measure with eight decimal places: %f%n", measure); // Ok
        System.out.printf("Rouded: %,3f%n", measure); // Ok
        Locale.setDefault(Locale.US); // Ok
        System.out.printf("US decimal point: %.3f%n", measure); // Ok



    }
}
