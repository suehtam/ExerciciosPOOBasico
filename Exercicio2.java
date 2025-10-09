/*
2. Média de Três Números
Solicite três números e imprima a média aritmética.
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio2
class Exercicio2 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt(); // Lê o primeiro número inteiro
        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite um número: ");
        int numero2 = sc.nextInt(); // Lê o segundo número inteiro
        // Solicita ao usuário que digite o terceiro número
        System.out.println("Digite um número: ");
        int numero3 = sc.nextInt(); // Lê o terceiro número inteiro
        // Calcula a média aritmética dos três números
        double media = (numero1 + numero2 + numero3) / 3.0;
        // Exibe o resultado da média aritmética
        System.out.println("A média aritmética dos números é: " + media);
    }
}
