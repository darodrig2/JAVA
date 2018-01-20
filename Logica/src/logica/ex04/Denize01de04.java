package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Denize01de04 extends Programa {

	@Override
	public void inicio() {
		double nota1 = leReal("Informe a 1° nota");
		double nota2 = leReal("Informe a 2° nota");
		double nota3 = leReal("Informe a 3° nota");
		double nota4 = leReal("Informe a 4° nota");
		double média = ( nota1 + nota2 + nota3 + nota4) / 4.0;
		escrevaL("Média: ", média);
			if (média <7) {
			escrevaL("Reprovado"); 
			} else { 
			escrevaL("Aprovado");}
	}
		
		

	}

