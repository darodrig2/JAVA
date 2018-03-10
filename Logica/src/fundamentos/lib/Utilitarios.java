package fundamentos.lib;

import javax.swing.JOptionPane;

public class Utilitarios {
	public static int leInteiro(String msg) {
		String aux = JOptionPane.showInputDialog(msg);
		return Integer.parseInt(aux);
	}
	
	public static double leReal(String msg) {
		String aux = JOptionPane.showInputDialog(msg);
		return Double.parseDouble(aux);
	}
}
