package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {

	@Override
	public void inicio() {
		int num1 = leInteiro("Informe a base");
		int num2 = leInteiro("Informe a altura");
		double resultado = (num1 * num2) / 2;
		escrevaL("A área é de: " , resultado);
	}

}
