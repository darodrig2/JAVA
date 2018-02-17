package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Denize01de05 extends Programa {

	@Override
	public void inicio() {
		//String.format("%04d", );
		
		for (int contador = 2; contador <= 1000; contador+=2) {
			escreva(String.format("%04d ", contador));
		}
	}

}


































































