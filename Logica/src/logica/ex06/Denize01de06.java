package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class Denize01de06 extends Programa {

	@Override
	public void inicio() {
		int[] valores = new int[10];
		int total = 0;

		int i = 0;
		while (i < valores.length) {
			valores[i] = leInteiro("Informe o ", i + 1, "° valor");
			total = total + valores[i];
			i++;
		}
		int média = total / 10;
		escrevaL("informe a média: ", média);

		escrevaL("Valores maiores que a média sâo:");
		i = 0;
		while (i < valores.length) {
			if (valores[i] > média) {
								escrevaL(valores[i]);
			}
			i++;
		}

	}
}
