/*
14. Conversão de Minutos em Horas e Minutos 
Solicite uma quantidade de minutos e converta para horas e minutos. 
Exemplo: 130 minutos → 2 horas e 10 minutos
*/
import java.util.Scanner;
class Exercicio14
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de minutos ");
        int minutosTotais = sc.nextInt();
        int horas = minutosTotais / 60;
        int minutos = minutosTotais % 60;
        System.out.println("O valor em horas e minutos é: " + horas + " horas" + " e " + minutos + " minutos");
    }
}
