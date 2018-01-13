package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {

	@Override
	public void inicio() {
	int num1 = leInteiro("informe a primeira nota");
	int num2 = leInteiro("informe a segunda nota");
	int num3 = leInteiro("informe a terceira nota");
	int num4 = leInteiro("informe a quarta nota");
	double resultado = (num1 + num2 + num3 + num4)  / 4.0;
      escrevaL("a média é: " , resultado);
	}

}
