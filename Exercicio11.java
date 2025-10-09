/*
11. Idade em Segundos 
Leia a idade da pessoa e mostre quantos segundos ela viveu. 
Considere: 
• 1 ano = 365 dias 
• 1 dia = 86400 segundos 
*/
import java.util.Scanner;
class Exercicio11
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade ");
        int idadeEmAnos = sc.nextInt();
        int idadeEmDias = idadeEmAnos * 365;
        int idadeEmSegundos = idadeEmDias * 86400;
        System.out.println("Você viveu " + idadeEmSegundos + " segundos.");
    }
}
