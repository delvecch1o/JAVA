/* Exercícios:
01) Faça um programa para calcular a área de um circulo a partir do raio.

Fórmula: Multiplique o raio ao quadrado por PI. Vamos considerar Pi = 3.14; */
/* A = r² x Pi */
/* "%.2f" -> limita as casas decimais." */


import java.util.Scanner;

public class AreaCirculo {



	public static void main(String[] args) {



		double Pi = 3.14;



		double Raio;



		double Area;



		



		Scanner sc = new Scanner(System.in);



		System.out.println("Digite o valor do Raio: ");



		Raio = sc.nextDouble();







		Area = (Raio * Raio * Pi);



		



		System.out.println(Area);



		



	}



}
