/*
9. Cálculo do IMC 
Peça o peso e a altura, calcule o IMC e exiba com duas casas decimais.
Fórmula: IMC = peso / (altura * altura)  
*/
import java.util.Scanner;
class Exercicio9
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu peso ");
        double peso = sc.nextDouble();
        System.out.println("Digite a sua altura ");
        double altura = sc.nextDouble();
        double imc = peso / (Math.pow(altura, 2));
        System.out.printf("O seu IMC é: %.2f", imc);
    }
}
