package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Denize02de04 extends Programa {

	@Override
	public void inicio() {
		int A = leInteiro("informe a");
		int B = leInteiro("informe b");
		int C = leInteiro("informe c");
		if (A == B && B == C && A == C) {
			escrevaL("Equilátero");
		} else if (A != B && A != C && B != C) {
			escrevaL("Escaleno");
		} else if (A == B || A == C || B == C)
			escrevaL("Isóceles");
	}

}
