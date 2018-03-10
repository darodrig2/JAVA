package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Denize03de07 extends Programa {

	@Override
	public void inicio() {
		int num = leInteiro("Informe o n° da conta");
		escrevaL("O dígito verificador para a conta ", num , " é ");

	}

}
