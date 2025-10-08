/*
2. Média de Três Números
Solicite três números e imprima a média aritmética.
*/
import java.util.Scanner;
class Exercicio2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite um número: ");
        int numero2 = sc.nextInt();
        System.out.println("Digite um número: ");
        int numero3 = sc.nextInt();
        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média aritmética dos números é: " + media);
    }
}
