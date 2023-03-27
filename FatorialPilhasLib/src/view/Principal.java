package view;
import controller.FatController;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws Exception {
		FatController f = new FatController();
		int i;
		
		do {
			i = Integer.parseInt(JOptionPane.showInputDialog("Valor de 0 a 10"));
		} while (i < 0 || i > 10);
		
		long fat = f.fatorial(i);
		System.out.println(fat);
	}

}
