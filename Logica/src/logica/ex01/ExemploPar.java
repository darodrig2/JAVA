package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class ExemploPar extends Programa {
	@Override
	public void inicio() {
	int num = leInteiro("Informe um n°");
	int resultado = num % 2;
	escrevaL("n° informado: " , num, "\nResultado: " , resultado);
	}
}
