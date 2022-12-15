//7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:

//Volume = p*Raio^2*Altura 


import java.util.Scanner;

public interface Exercicio07 {

public static void main (String[]args) {
	
Scanner sc = new Scanner(System.in);

System.out.println("Digite o Valor do raio");

double raio= sc.nextInt();

System.out.println("Digite o valor da altura");

double altura= sc.nextInt();

double volume = 3.14 * raio*raio * altura;

System.out.println ( "O volume da lata é:" + volume + "M3");

}};
