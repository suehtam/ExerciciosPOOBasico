/*
9. Cálculo do IMC 
Peça o peso e a altura, calcule o IMC e exiba com duas casas decimais.
Fórmula: IMC = peso / (altura * altura)  
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio9
class Exercicio9 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite o peso (em quilogramas)
        System.out.println("Digite o seu peso ");
        double peso = sc.nextDouble(); // Lê o peso como número decimal
        // Solicita ao usuário que digite a altura (em metros)
        System.out.println("Digite a sua altura ");
        double altura = sc.nextDouble(); // Lê a altura como número decimal
        // Calcula o IMC usando a fórmula: IMC = peso / (altura * altura)
        // Math.pow(altura, 2) eleva a altura ao quadrado
        double imc = peso / (Math.pow(altura, 2));
        // Exibe o IMC com duas casas decimais usando printf
        System.out.printf("O seu IMC é: %.2f", imc);
    }
}
