/*
1. Saudação com Scanner
Peça ao usuário que digite seu nome e exiba:
Olá, [nome]!
*/
// Importa a classe Scanner para ler dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio1
class Exercicio1 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Exibe uma mensagem pedindo que o usuário digite seu nome
        System.out.println("Digite o seu nome: ");
        // Lê a linha digitada pelo usuário e armazena na variável 'nome'
        String nome = sc.nextLine();
        // Exibe uma saudação personalizada com o nome informado
        System.out.println("Olá, " + nome + "!");
    }
}
