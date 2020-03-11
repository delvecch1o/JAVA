// Exercício 1: Você foi contratado para fazer um programa que descobre se um ano é bissexto ou nao.

 // Regras:
 //- São bissextos todos os anos múltiplos de 400, por exemplo 1600,2000,2400, ....
 // - São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996,2004,2008,2012
 // - Não são bissextos todos os demais
 
 
 import java.util.Scanner;


public class AnoBissextos {
	
	
	
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite algum ano? ");
		int ano = entrada.nextInt();
		
		
		if (ano < 0){
			 System.out.println("Não é um ano!"); 
		} else if (ano % 4 == 0 && ano % 100 != 0){
			System.out.println("eh bissexto!"); 
			} else { System.out.println("nao eh bissexto!");
			}
	}
}
		
		
