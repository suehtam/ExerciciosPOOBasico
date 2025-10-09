/*
10. Área de um Retângulo 
Peça a base e a altura e calcule: 
Área = base × altura
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio10
class Exercicio10 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite a base do retângulo
        System.out.println("Digite a base do retângulo ");
        double base = sc.nextDouble(); // Lê a base como número decimal
        // Solicita ao usuário que digite a altura do retângulo
        System.out.println("Digite a altura do retângulo");
        double altura = sc.nextDouble(); // Lê a altura como número decimal
        // Calcula a área do retângulo usando a fórmula: área = base × altura
        double area = base * altura;
        // Exibe o resultado da área calculada
        System.out.println("A área do retângulo é: " + area);
    }
}
