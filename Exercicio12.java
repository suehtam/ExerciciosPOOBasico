/*
12. Teorema de Pitágoras 
Peça os valores dos catetos a e b, e calcule a hipotenusa: 
hipotenusa = √(a² + b²) 
Use Math.sqrt() e System.out.printf() com 2 casas decimais.
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;

// Declaração da classe principal chamada Exercicio12
class Exercicio12 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite o valor do cateto A
        System.out.println("Digite o valor do cateto A ");
        double catetoA = sc.nextDouble(); // Lê o valor como número decimal
        // Solicita ao usuário que digite o valor do cateto B
        System.out.println("Digite o valor do cateto B ");
        double catetoB = sc.nextDouble(); // Lê o valor como número decimal
        // Calcula a hipotenusa usando o Teorema de Pitágoras: √(a² + b²)
        // Math.pow eleva os catetos ao quadrado, Math.sqrt calcula a raiz quadrada
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        // Exibe o valor da hipotenusa com duas casas decimais
        System.out.printf("O valor da hipotenusa é: %.2f", hipotenusa);
    }
}
