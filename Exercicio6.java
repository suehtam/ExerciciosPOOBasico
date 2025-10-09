/*
6. Cálculo do Tempo de Viagem
Pergunte a distância da viagem (em km) e a velocidade média (em km/h).
Calcule e exiba o tempo estimado da viagem (com duas casas decimais):
tempo = distancia / velocidade
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio6
class Exercicio6 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite a distância da viagem em quilômetros
        System.out.println("Digite a distância da viagem: ");
        double distanciaViagem = sc.nextDouble(); // Lê a distância como número decimal
        // Solicita ao usuário que digite a velocidade média em km/h
        System.out.println("Digite a velocidade média: ");
        double velocidadeMedia = sc.nextDouble(); // Lê a velocidade como número decimal
        // Calcula o tempo estimado da viagem usando a fórmula: tempo = distância / velocidade
        double tempoViagem = distanciaViagem / velocidadeMedia;
        // Exibe o tempo estimado com duas casas decimais usando printf
        System.out.printf("O tempo estimado da viagem foi: %.2f horas", tempoViagem);
    }
}
