package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Denize04de04 extends Programa {

	@Override
	public void inicio() {
		while (true) {
		String Nome = leTexto("Informe o Nome");
		double nota1 = leReal("Informe a 1° Nota");
		double nota2 = leReal("Informe a 2° Nota");
		double nota3 = leReal("Informe a 3° Nota");
		double faltas = leReal("Informe o n° de faltas");
		double média = (nota1 + nota2 + nota3) / 3.0;
		if (faltas > 15) {
			escrevaL(Nome, " você foi: Reprovado por Faltas");

		} else if (média >= 7) {
			escrevaL(Nome, " você foi: Aprovado");

		} else {
			escrevaL(Nome, " você foi: Reprovado por nota");
		}

	}
}
}
