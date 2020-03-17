import java.util.Scanner;

public class EstruturaWhile {
	
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print ("Digite um numero inicial: ");
		int nemeroInicial = entrada.nextInt ();
		
		System.out.print ("Digite um numero final: ");
		int numeroFinal = entrada.nextInt ();
		
		int numeroAtual = nemeroInicial;
		
		while (numeroAtual <= numeroFinal) {
			System.out.print (numeroAtual);
			numeroAtual ++;
		}
}
}