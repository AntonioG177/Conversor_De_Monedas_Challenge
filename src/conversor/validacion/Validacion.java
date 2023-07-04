package conversor.validacion;

import javax.swing.JOptionPane;

public class Validacion {
	
	public boolean validarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x > 0);
				return true;
			
		}catch(NumberFormatException e) {	
			JOptionPane.showMessageDialog(null, "Valor invalido!");
			return false; 
		}
	}
}
