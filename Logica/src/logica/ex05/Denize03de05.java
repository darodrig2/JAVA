package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Denize03de05 extends Programa {

	@Override
	public void inicio() {
		int NUM1 = leInteiro("informe um n°");
		int NUM2 = leInteiro("informe um n°");
		int NUM3 = leInteiro("informe um n°");
		int NUM4 = leInteiro("informe um n°");
		int NUM5 = leInteiro("informe um n°");
		double resultado = (NUM1+NUM2+NUM3+NUM4+NUM5);
		escrevaL("A soma: ", resultado);
		escrevaL("A média: ", resultado/5);
	}

}
