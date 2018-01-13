package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class Ex01denize extends Programa {

	@Override
	public void inicio() {
	int num1 = leInteiro("informe um n°");
	int num2 = leInteiro("informe um n°");
	double resultado = Math.pow(num1 , num2);
	escrevaL("O resultado foi: ", resultado);
	}
}
