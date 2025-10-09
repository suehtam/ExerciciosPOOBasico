/*
7. Área e Perímetro de um Círculo
Solicite o raio e calcule:
• Área: A = πr²
• Perímetro: P = 2πr
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio7
class Exercicio7 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite o valor do raio do círculo
        System.out.println("Digite o raio ");
        double raio = sc.nextDouble(); // Lê o valor do raio como número decimal (double)
        // Calcula a área do círculo usando a fórmula: A = π × r²
        // Math.PI representa o valor de π (pi)
        // Math.pow(raio, 2) eleva o raio ao quadrado
        double area = Math.PI * Math.pow(raio, 2);
        // Exibe o resultado da área do círculo
        System.out.println("A área do círculo é: " + area);
        // Calcula o perímetro do círculo usando a fórmula: P = 2 × π × r
        double perimetro = 2 * Math.PI * raio;
        // Exibe o resultado do perímetro do círculo
        System.out.println("O perímetro do círculo é: " + perimetro);
    }
}
