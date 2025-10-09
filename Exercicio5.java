/*
5. Operações com Dois Números
Solicite dois números inteiros e mostre: soma, subtração, multiplicação e divisão.
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio5
class Exercicio5 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um número: ");
        double numero1 = sc.nextDouble(); // Lê o primeiro número como ponto flutuante 
        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite um número: ");
        double numero2 = sc.nextDouble(); // Lê o segundo número como ponto flutuante 
        // Realiza a soma dos dois números
        double soma = numero1 + numero2;
        // Realiza a subtração dos dois números
        double subtracao = numero1 - numero2;
        // Realiza a multiplicação dos dois números
        double multiplicacao = numero1 * numero2;
        // Realiza a divisão dos dois números
        double divisao = numero1 / numero2;
        // Exibe os resultados das operações
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subtracao);
        System.out.println("A multiplicação dos números é: " + multiplicacao);
        System.out.println("A divisão dos números é: " + divisao);
    }
}
