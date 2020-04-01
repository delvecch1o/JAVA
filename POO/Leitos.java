package AcessandoTributos;

public class Leitos {

	public static void main(String[] args) {
// instanciar um objeto, é criar na memoria um objeto, criar um objeto na memoria dentro da maquina 
		
		Paciente paciente = new Paciente ();  // Paciente é a classe com seus atributos, pacientes normais
		Paciente pacienteCorona = new Paciente (); // novo Objeto da classe tipo Pacinte, é pacienteCorona , pacientes morrendo.
		
		paciente.nome = "Davi" ;
		paciente.Idade = 22 ;
		paciente.sexo = 'M' ;
		paciente.residencia = "Maringa" ;
		
		pacienteCorona.nome = "Jose Dirceu" ;
		pacienteCorona.Idade = 65 ;
		pacienteCorona.sexo = 'M' ;
		pacienteCorona.residencia = "Pato Branco" ;
		
		System.out.println("-----PACIENTES GERAIS -----");
		System.out.println("Nome: " + paciente.nome);
		System.out.println("Idade: " + paciente.Idade);
		System.out.println("Sexo: " + paciente.sexo);
		System.out.println("Residencia: " + paciente.residencia);
		
		System.out.println("------CENARIO CAOTICO--------");
		
		System.out.println("Nome: " + pacienteCorona.nome);
		System.out.println("Idade: " + pacienteCorona.Idade);
		System.out.println("Sexo: " + pacienteCorona.sexo);
		System.out.println("Residencia: " + pacienteCorona.residencia);
		
		
		
	}

}
