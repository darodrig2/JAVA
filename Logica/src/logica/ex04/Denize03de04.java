package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Denize03de04 extends Programa {

	@Override
	public void inicio() {
		double A = leReal("informe o valor de a");
		double B = leReal("informe o valor de b");
		double C = leReal("informe o valor de c");
		
		double D = Math.pow(B, 2) - 4 * A * C;
		if (D >=0) {
		double E = (-B + Math.sqrt(D)) / 2 * A;
        double F = (-B - Math.sqrt(D)) / 2 * A;
      	escrevaL("x'= ", (int)E);
      	escrevaL("x''= ", (int)F);
		} else {
			escrevaL ("a raiz é indeterminada");
		}
	
		
	}
}

