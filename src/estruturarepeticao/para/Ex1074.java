package estruturarepeticao.para;

import java.util.Scanner;

public class Ex1074 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros: ");
        int n = scanner.nextInt();

        for(int i =1; i <= n; i++){
            int x = scanner.nextInt();
            if (x == 0) {
                System.out.println("NULL");
            }else {
                if (x % 2 == 0) {
                    if (x > 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("EVEN NEGATIVE");
                    }
                } else {
                    if (x > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }

        }

        scanner.close();
    }
}
