package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Denize04de03 extends Programa {

	@Override
	public void inicio() {
		double salário = leReal("Informe o salário");
		if (salário <= 300.00) {
			double resultado = salário - salário * 5 / 100;
			escrevaL("Salário líquido: ", resultado);
		} else if (salário <= 1200.00) {
			double resultado = salário - salário * 10 / 100;
			escrevaL("Salário líquido: ", resultado);
		} else {
			double resultado = salário - salário * 15 / 100;
			escrevaL("Salário líquido: ", resultado);
		}
	}
}