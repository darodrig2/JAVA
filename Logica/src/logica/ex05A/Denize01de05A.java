package logica.ex05A;

import br.senai.sp.info132.console.Programa;

public class Denize01de05A extends Programa {

	@Override
	public void inicio() {
	
	double total = 0;
	int quantidade = 0;
	int Preço = leInteiro("Informe o Preço");
	while(Preço > 0) {
		total = total + Preço;				
		quantidade++;
		
		Preço = leInteiro("Informe o Preço");
	}
	double média = total / quantidade;
		escrevaL("A média: ", média);	
	}

}




	




/
