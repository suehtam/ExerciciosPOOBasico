/*
11. Idade em Segundos 
Leia a idade da pessoa e mostre quantos segundos ela viveu. 
Considere: 
• 1 ano = 365 dias 
• 1 dia = 86400 segundos 
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio11
class Exercicio11 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite sua idade em anos
        System.out.println("Digite a sua idade ");
        int idadeEmAnos = sc.nextInt(); // Lê a idade como número inteiro
        // Converte a idade de anos para dias (considerando 365 dias por ano)
        int idadeEmDias = idadeEmAnos * 365;
        // Converte a idade de dias para segundos (considerando 86400 segundos por dia)
        int idadeEmSegundos = idadeEmDias * 86400;
        // Exibe o total de segundos vividos
        System.out.println("Você viveu " + idadeEmSegundos + " segundos.");
    }
}
