package logica.Denizefundamentos;

import javax.swing.JOptionPane;

import fundamentos.lib.Utilitarios;

public class Denizefundamento01 {

	public static void main(String[] args) {
		int quant1 = Utilitarios.leInteiro("Informe a quantidade");
		
		double vlr1 = Utilitarios.leReal("Iforme o valor");
		
		double total1 = quant1 * vlr1; 
		
		

		int quant2 = Utilitarios.leInteiro("Informe a quantidade");
		
		double vlr2 = Utilitarios.leReal("Iforme o valor");
		
		double total2 = quant2 * vlr2;
		
			
		
		int quant3 = Utilitarios.leInteiro("Informe a quantidade");
		
		double vlr3 = Utilitarios.leReal("Iforme o valor");
		
		double total3 = quant2 * vlr2;
		
		
		double TOTAL = total1 + total2 + total3;
		
		
		JOptionPane.showMessageDialog(null, "O total é R$ " + TOTAL);
		

	}

}
