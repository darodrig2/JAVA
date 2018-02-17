package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Denize03de05A extends Programa {

	@Override
	public void inicio() {
		double limite = 5;
		double total = 0;
		int contador = 1;
		while (contador <= limite) {
    		double valor = leReal("informe um n°");
			total = total + valor;
			contador = contador + 1;
		}
		
	escrevaL("A soma: ", total);
	escrevaL("A média: ", total/5);
	}
}

			
		
		
		




