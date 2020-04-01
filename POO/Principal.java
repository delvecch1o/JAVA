package teste;

public class Principal {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro (); // foi criado uma variavel meuCarro do tipo Carro, que carrega todas as informções do tipo Carro,aonde esse carro vai ter todas as caracteristicas criadas
		meuCarro.modelo = "Honda Civic" ;
		meuCarro.anoDeFabricacao = 2019 ;
		
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano : " + meuCarro.anoDeFabricacao);
		
		
		
		
	}

}
