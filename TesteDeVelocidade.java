import java.util.Scanner;
 
 
public class TesteDeVelocidade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Teste de Velocidade");
        System.out.println("Qual a velocidade maxima permitida na via trafegada ?");
 
        int velocidade = entrada.nextInt();
 
        System.out.println("Seu veiculo eh carro de passeio digite [1] se for onibus digite [2] ");
        int numero = entrada.nextInt();
        // 1 = velocidade * 10 / 100
        // 2 = velocidade * 5 /  100
 
        if (numero == 1) {
            System.out.println("Carro de Passeio");
            int x = velocidade * 10 / 100;
 
            if (velocidade + x < velocidade) {
                System.out.println("Multado");
            }
        } else if (numero == 2) {
            System.out.println("Onibus");
            int y = velocidade * 5 / 100;
 
            if (velocidade + y < velocidade) {
                System.out.println("Multado");
            }
        }
    }
}