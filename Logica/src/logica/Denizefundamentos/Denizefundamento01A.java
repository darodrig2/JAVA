package logica.Denizefundamentos;

import javax.swing.JOptionPane;

import fundamentos.lib.Utilitarios;

public class Denizefundamento01A {

	public static void main(String[] args) {
		int quant1 = Utilitarios.leInteiro("Informe a quantidade 1");
		
		double vlr1 = Utilitarios.leReal("Iforme o valor 1");
		
			

		int quant2 = Utilitarios.leInteiro("Informe a quantidade 2");
		
		double vlr2 = Utilitarios.leReal("Iforme o valor 2");
		
					
		
		int quant3 = Utilitarios.leInteiro("Informe a quantidade 3");
		
		double vlr3 = Utilitarios.leReal("Iforme o valor 3");
		
			
		
		double TOTAL = quant1 * vlr1 + quant2 * vlr2 + quant3 * vlr3;
		
		
		JOptionPane.showMessageDialog(null, "O total é R$ " + TOTAL);
		

	}

}
