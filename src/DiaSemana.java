import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana:");
        int diaSemana = scanner.nextInt();
        String dia = "";

        switch (diaSemana){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terca";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Dia nao encontrado";
        }
        System.out.println(dia);
    }
}
