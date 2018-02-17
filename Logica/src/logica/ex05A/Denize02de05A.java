package logica.ex05A;

import br.senai.sp.info132.console.Programa;

public class Denize02de05A extends Programa {
	
	@Override
	public void inicio() {
		double total =0;
		int quantidade = 0;
		int analista = leInteiro("Informe o número");
		while (analista > 0) {
			total = total + analista;				
			quantidade++;
			analista = leInteiro("Informe analista");
		}
		while (programador > 0) {
		total = total + programador;				
		quantidade++;			
		programador = leInteiro("Informe programador");
		}
		while (usuário > 0) {
			total = total + usuário;				
			quantidade++;			
			usuário = leInteiro("Informe usuário");
			}
	}

}
