package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Denize06de03 extends Programa {

	@Override
	public void inicio() {
		int idade = leInteiro("Informe sua idade");
		if (idade <= 10) {
			escrevaL("Sua Classificação é: Infantil");
		} else if (idade <= 15) {
			escrevaL("Sua Classificação é: Infanto");
		} else if (idade <= 18) {
			escrevaL("Sua Classificação é: Juvenil");
		} else
			escrevaL("Sua Classificação é: Adulto");

	}

}
