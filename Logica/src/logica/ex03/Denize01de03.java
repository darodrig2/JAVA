package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Denize01de03 extends Programa {

	@Override
	public void inicio() {
		int num1 = leInteiro("Informe o primeiro n�");
		int num2 = leInteiro("informe o segundo n�");
		if (num1 == num2) {
		escrevaL("é igual");} 
		else {
			escrevaL("é diferente");}
		
		}

	}

