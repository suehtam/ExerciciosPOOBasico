/*
4. Conversão de Celsius para Fahrenheit
Converta a temperatura com a fórmula:
F = (C × 9/5) + 32
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio4
class Exercicio4 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite a temperatura em Celsius
        System.out.println("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = sc.nextDouble(); // Lê a temperatura como número inteiro
        // Converte a temperatura de Celsius para Fahrenheit usando a fórmula: F = (C × 9/5) + 32
        // O uso de 9.0 e 5.0 garante que a divisão seja feita com ponto flutuante (double)
        double temperaturaFahrenheit = ((temperaturaCelsius * (9.0 / 5.0)) + 32 );
        // Exibe o resultado da conversão
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
    }
}
