/*
13. Volume de uma Esfera 
Peça o raio (entre 1.0 e 50.0) e calcule o volume: 
V = (4/3) × π × r³ 
Use π = 3.14 e arredonde com 2 casas decimais.
*/
import java.util.Scanner;
class Exercicio13
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio entre 1.0 e 50.0 ");
        double raio = sc.nextDouble();
        double volume = (4 / 3) * Math.PI * Math.pow(raio, 2);
        System.out.printf("O volume da esfera é: %.2f", volume);
    }
}
