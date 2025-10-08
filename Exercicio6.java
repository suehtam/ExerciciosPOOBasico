/*
6. Cálculo do Tempo de Viagem
Pergunte a distância da viagem (em km) e a velocidade média (em km/h).
Calcule e exiba o tempo estimado da viagem (com duas casas decimais):
tempo = distancia / velocidade
*/
import java.util.Scanner;
class Exercicio6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distância da viagem: ");
        int distanciaViagem = sc.nextInt();
        System.out.println("Digite a velocidade média: ");
        int velocidadeMedia = sc.nextInt();
        double tempoViagem = distanciaViagem / velocidadeMedia;
        System.out.printf("O tempo estimado da viagem foi: %.2f quilômetros por hora", tempoViagem);
    }
}
