import java.util.Scanner;

public class OperadorTernario {
	
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print ("Digite a sua idade: ");
		
		int idade = entrada.nextInt ();
		
		String indicacao = (idade >= 18) ? "adulto" : (idade <= 12 ? "crianca" : " adolescente"); // os dois pontos de 
		// ponto de interrogacao significa if e  : " adolescente os dois pontos ":" significa else
		
		System.out.print ("Resultado: " + indicacao);
		
		
		
		
	}
}
