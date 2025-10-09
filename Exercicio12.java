/*
13. Volume de uma Esfera 
Peça o raio (entre 1.0 e 50.0) e calcule o volume: 
V = (4/3) × π × r³ 
Use π = 3.14 e arredonde com 2 casas decimais.
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
        int catetoB = sc.nextInt();
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.printf("O valor da hipotenusa é: %.2f", hipotenusa);
    }
}
