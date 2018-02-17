package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Denize02de05 extends Programa {

	@Override
	public void inicio() {
		int Num1 = leInteiro("informe o 1° número");
		int Num2 = leInteiro("informe o último número");
		if(Num1 % 2 == 0) {
			Num1++;
		}
		for (int contador = Num1; contador < Num2;  contador+=2) {
			escreva(String.format("%04d ", contador));
		}

	}

}
