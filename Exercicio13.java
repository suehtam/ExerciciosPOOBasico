/*
13. Volume de uma Esfera 
Peça o raio (entre 1.0 e 50.0) e calcule o volume: 
V = (4/3) × π × r³ 
Use π = 3.14 e arredonde com 2 casas decimais.
*/
// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;
// Declaração da classe principal chamada Exercicio13
class Exercicio13 
{
    // Método principal que inicia a execução do programa
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que digite o valor do raio entre 1.0 e 50.0
        System.out.println("Digite o raio entre 1.0 e 50.0 ");
        double raio = sc.nextDouble(); // Lê o valor do raio como número decimal
        // Define o valor de π como 3.14 conforme solicitado no enunciado
        double pi = 3.14;
        // Calcula o volume da esfera usando a fórmula: V = (4/3) × π × r³
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
        // Exibe o volume com duas casas decimais usando printf
        System.out.printf("O volume da esfera é: %.2f", volume);
    }
}
