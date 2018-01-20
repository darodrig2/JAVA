package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Denize03de03 extends Programa {

	@Override
	public void inicio() {
		int num1 = leInteiro("Informe o valor de A");
		int num2 = leInteiro("Informe o valor de B");
		if(num1 % num2 == 0) {
			escrevaL("É divisível");}
		else {
			escrevaL("Não é divisível");}
		}
}
