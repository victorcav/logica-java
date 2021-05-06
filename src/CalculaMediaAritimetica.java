/*
Suponha um programa que solicita ao usuario dois numeros e depois mostra a media aritimetica deles
    Ex:
        **ENTRADA**
            Digite o primeiro numero: 3
            Digite o segundo numero: 6
        **PROCESSAMENTO**
            Media = (3 + 6) / 2
        **SAIDA DE DADOS**
            Media aritimetica = 4.5
 */

public class CalculaMediaAritimetica {

    public static void main(String[] args){

        // **ENTRADA DE DADOS**
        System.out.println("Digite o primeiro valor:");
        double primeiroNumero = 3;

        System.out.println("Digite o segundo numero: ");
        double segundoNumero = 6;

        //**PROCESSAMENTO**
        double resultado = (primeiroNumero+segundoNumero) / 2;

        //**SAIDA DE DADOS**
        System.out.println("O resultado eh " + resultado);
    }
}
