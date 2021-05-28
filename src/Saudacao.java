import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora atual: ");
        int horaAtual = scanner.nextInt();

        if(horaAtual >= 6 && horaAtual < 12){
            System.out.println("BOM DIA!");
        }else if(horaAtual >= 12 && horaAtual < 18){
            System.out.println("BOA TARDE!");
        }else{
            System.out.println("BOA NOITE!");
        }

        scanner.close();

    }
}
