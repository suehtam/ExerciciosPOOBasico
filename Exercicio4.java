import java.util.Scanner;
/*4. Conversão de Celsius para Fahrenheit
Converta a temperatura com a fórmula:
F = (C × 9/5) + 32
*/
class Exercicio4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        int temperaturaCelsius = sc.nextInt();
        double temperaturaFahrenheit = ((temperaturaCelsius * (9 / 5)) + 32 );
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
    }
}
