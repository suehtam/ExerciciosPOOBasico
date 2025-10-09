/*
3. Cálculo de Idade
Peça ao usuário o ano de nascimento, calcule a idade com base no ano atual (ex: 2025) e
exiba o resultado no console.
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio3
class Exercicio3 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite o ano de nascimento
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt(); // Lê o ano de nascimento como um número inteiro
        // Calcula a idade subtraindo o ano de nascimento do ano atual (2025)
        int idade = 2025 - anoNascimento;
        // Exibe a idade calculada
        System.out.println("A sua idade é: " + idade);
    }
}
