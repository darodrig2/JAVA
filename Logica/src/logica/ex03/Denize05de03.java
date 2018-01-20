package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Denize05de03 extends Programa {

	@Override
	public void inicio() {
		int num1 = leInteiro("Informe o primeiro número");
		int num2 = leInteiro("Informe o segundo número");
		
		if(num1 < num2) {
			escrevaL(num1, " ", num2);
		} else {
			escrevaL(num2, " ", num1);
		}
	}
}
