package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		imprimirSelecionados();
		
	}
	
	static void selecaoCandidatos () {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE", "CASTRO", "LUAN"};
		
		int candidatosSelecionados = 0;
		int candidatosAtuais = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5) {
			String candidato = candidatos[candidatosAtuais];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
				candidatosSelecionados++;
			}
			candidatosAtuais++;
		}
	}
	
	static double valorPretendido () {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO.");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");
		}
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
		}
		
		System.out.println("Utilizando o foreach para uma forma mais abreviada: ");
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
}
