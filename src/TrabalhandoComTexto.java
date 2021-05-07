/* Criar uma mensagem que solicite o nome, idade, peso, altura do usuario */

import java.util.Scanner;

public class TrabalhandoComTexto {

        public  static void main (String[] args){

                Scanner scanner = new Scanner(System.in);

                //**ENTRADA DE DADOS**
                System.out.println("Digite o seu nome: ");
                String nome = scanner.nextLine();

                System.out.println("Digite a sua idade: ");
                int idade = scanner.nextInt();

                System.out.println("Digite a sua altura: ");
                double altura = scanner.nextDouble();

                System.out.println("Digite a seu peso: ");
                double peso = scanner.nextDouble();

                //**PROCESSAMENTO**
                String valoresConcatenados = "Oi, meu nome é " + nome + ", tenho " + idade + " anos, minha altura é " + altura + " metros e estou pesando " + peso + " Kg";

                //**SAIDA DE DADOS**
                System.out.println(valoresConcatenados);

                scanner.close();


        }
}
