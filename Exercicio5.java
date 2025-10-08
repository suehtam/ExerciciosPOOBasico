import java.util.Scanner;
/*
5. Operações com Dois Números
Solicite dois números inteiros e mostre: soma, subtração, multiplicação e divisão.
*/
class Exercicio5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite um número: ");
        int numero2 = sc.nextInt();
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subtracao);
        System.out.println("A multiplicação dos números é: " + multiplicacao);
        System.out.println("A divisão dos números é: " + divisao);
    }
}
