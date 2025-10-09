/*
15. Custo de uma Refeição com Taxa de Serviço 
Peça o valor da refeição (em reais). 
Calcule o total com taxa de serviço de 10% e exiba com duas casas decimais.
*/
import java.util.Scanner;
class Exercicio15
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da refeição ");
        double valorRefeicao = sc.nextDouble();
        double valorComTaxa = valorRefeicao * 1.10;
        System.out.printf("O valor total com a taxa de serviço é: %.2f", valorComTaxa);
    }
}
