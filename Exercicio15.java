/*
15. Custo de uma Refeição com Taxa de Serviço 
Peça o valor da refeição (em reais). 
Calcule o total com taxa de serviço de 10% e exiba com duas casas decimais.
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio15
class Exercicio15 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite o valor da refeição em reais
        System.out.println("Digite o valor da refeição ");
        double valorRefeicao = sc.nextDouble(); // Lê o valor como número decimal
        // Calcula o valor total com taxa de serviço de 10%
        double valorComTaxa = valorRefeicao * 1.10;
        // Exibe o valor total com duas casas decimais
        System.out.printf("O valor total com a taxa de serviço é: %.2f", valorComTaxa);
    }
}
