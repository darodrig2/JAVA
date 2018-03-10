package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Denize02de07 extends Programa {

	@Override
	public void inicio() {
		int num = leInteiro("Informe um n°");
		escrevaL("O inverso do ", num , " é ", inverso(num));

	}
	int inverso(int num) {
	 for(num = 0; num < 10; num++ ) {
		 int inverso = num % 10;
		 num /= 10;
	 }
	     return 0;
	 
}	
}
