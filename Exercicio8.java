/*
8. Conversão de Dólar para Real 
Solicite um valor em dólar e converta para reais usando a taxa fixa: 
1 USD = 5.10 BRL 
Exiba o resultado no console. 
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio8
class Exercicio8 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite o valor em dólar
        System.out.println("Digite o valor em dólar ");
        double valorDolar = sc.nextDouble(); // Lê o valor digitado como número decimal
        // Converte o valor em dólar para reais usando a taxa fixa de 5.10
        double valorReal = valorDolar * 5.1;
        // Exibe o valor convertido em reais
        System.out.println("O valor em reais é: " + valorReal);
    }
}
