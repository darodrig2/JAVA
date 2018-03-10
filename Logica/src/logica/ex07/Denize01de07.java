package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Denize01de07 extends Programa {

	@Override
	public void inicio() {
		int num = leInteiro("informe o número");

		if (ePar(num)) {
			escrevaL("O número ", num ," é par");
		} else {
			escrevaL("O número ", num ," é impar");
		}

	}

	boolean ePar(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
