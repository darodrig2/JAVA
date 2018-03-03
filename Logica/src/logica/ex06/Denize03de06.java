package logica.ex06;

import br.senai.sp.info132.console.Programa;
import logica.lib.Utilitarios;

public class Denize03de06 extends Programa {

	@Override
	public void inicio() {

		int[] valor = new int[10];
		int num = 0;

		for (int pos = 0; pos < valor.length; pos++) {
			valor[pos] = leInteiro("Informe o ", pos + 1, "º valor");
			num += valor[pos];
		}
		
		escrevaL("Números pares:");
		
		for (int pos = 0; pos < valor.length; pos++) {
			if (valor[pos] % 2 == 0) {
				escreva ("  " , valor[pos]);

			}
		}
		escrevaL("  ");
		escrevaL("Números impares:");
		for (int pos = 0; pos < valor.length; pos++) {
			if (valor[pos] % 2 != 0) {
				escreva ("  " , valor[pos]);
			}
		}

	}
}
