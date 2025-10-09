/*
8. Conversão de Dólar para Real 
Solicite um valor em dólar e converta para reais usando a taxa fixa: 
1 USD = 5.10 BRL 
Exiba o resultado no console. 
*/
import java.util.Scanner;
class Exercicio8
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em dólar ");
        double valorDolar = sc.nextDouble();
        double valorReal = valorDolar * 5.1;
        System.out.println("O valor em reais é: " + valorReal);
    }
}
