import java.util.Scanner;
 
 
public class TesteDeVelocidade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Teste de Velocidade");
        System.out.println("Qual a velocidade maxima permitida na via trafegada ?");
        int velocidadeMaxima = entrada.nextInt();  // velocidade permitida
 
        System.out.println("Seu veiculo eh carro de passeio digite [1] se for onibus digite [2] ");
        int numero = entrada.nextInt();
       
        System.out.println("Qual foi a velocidade que voce passou ? "); // velocidade registrada
        int velocidadeVeiculo = entrada.nextInt();
       
       
        // 1 = velocidade * 10 / 100
        // 2 = velocidade * 5 /  100
 
        if (numero == 1) {
            System.out.println("Carro de Passeio");
            int x = velocidadeMaxima * 10 / 100;
 
            if (velocidadeMaxima + x > velocidadeVeiculo) {
                System.out.println("Multado");
            }
        } else if (numero == 2) {
            System.out.println("Onibus");
            int y = velocidadeMaxima * 5 / 100;
 
            if (velocidadeMaxima + y > velocidadeVeiculo) {
                System.out.println("Multado");
            }
        }
    }
}