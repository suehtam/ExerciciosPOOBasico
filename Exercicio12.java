/*
12. Teorema de Pitágoras 
Peça os valores dos catetos a e b, e calcule a hipotenusa: 
hipotenusa = √(a² + b²) 
Use Math.sqrt() e System.out.printf() com 2 casas decimais. 
*/
import java.util.Scanner;
class Exercicio12
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do cateto A ");
        int catetoA = sc.nextInt();
        System.out.println("Digite o valor do cateto B ");
        int catetoB = isc.nextInt();
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.printf("O valor da hipotenusa é: %.2f", hipotenusa);
    }
}
