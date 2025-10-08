import java.util.Scanner;
/*1. Saudação com Scanner
Peça ao usuário que digite seu nome e exiba:
Olá, [nome]!*/
class Exercicio1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome + "!");
    }
}
