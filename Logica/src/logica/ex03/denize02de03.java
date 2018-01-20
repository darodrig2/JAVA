package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class denize02de03 extends Programa {

	@Override
	public void inicio() {
		int num = leInteiro("informe um número");
		if (num % 2 == 0) {
			escrevaL("Par");
		} else {
			escrevaL("Impar");
		}

	}
}