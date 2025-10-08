/*
7. Área e Perímetro de um Círculo
Solicite o raio e calcule:
• Área: A = πr²
• Perímetro: P = 2πr
*/
import java.util.Scanner;
class Exercicio7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio ");
        int raio = sc.nextInt();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
        double perimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro do círculo é: " + perimetro);
    }
}
