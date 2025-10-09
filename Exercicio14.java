/*
14. Conversão de Minutos em Horas e Minutos 
Solicite uma quantidade de minutos e converta para horas e minutos. 
Exemplo: 130 minutos → 2 horas e 10 minutos
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio14
class Exercicio14 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite a quantidade total de minutos
        System.out.println("Digite a quantidade de minutos ");
        int minutosTotais = sc.nextInt(); // Lê o valor como número inteiro
        // Calcula o número de horas inteiras
        int horas = minutosTotais / 60;
        // Calcula os minutos restantes após extrair as horas
        int minutos = minutosTotais % 60;
        // Exibe o resultado formatado em horas e minutos
        System.out.println("O valor em horas e minutos é: " + horas + " horas e " + minutos + " minutos");
    }
}
