/*3. Cálculo de Idade
Peça ao usuário o ano de nascimento, calcule a idade com base no ano atual (ex: 2025) e
exiba o resultado no console.*/
import java.util.Scanner;
class Exercicio3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = 2025 - anoNascimento;
        System.out.println("A sua idade é: " + idade);
    }
}
