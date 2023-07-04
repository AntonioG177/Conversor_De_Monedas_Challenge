package conversor.moneda;

import javax.swing.JOptionPane;

public class ConversorMonedas {

	public String conversorMoneda(){
	    	   	
	        String[] options = {"Convertir peso mexicano a dolar", 
	        		"Convertir peso mexicano a euro", 
	        		"Convertir peso mexicano a libra esterlina",
	        		"Convertir peso mexicano a yen japones",
	        		"Convertir peso mexicano a won sul-coreano"};
	        String selection = (String) JOptionPane.showInputDialog
	        		(null, "Seleccione una opcion de conversion", 
	        				"Conversor de monedas by AntonioG", 
	        				JOptionPane.PLAIN_MESSAGE, 
	        				null, options, options[0]);
	        return selection;
	}

	public void pesoADolar(double pesos) {
		double conversion = pesos * 0.058;
		JOptionPane.showMessageDialog(null, String.format("Tienes %.2f dolares!",conversion),
				"Conversor de monedas by AntonioG", 1);
	}

	public void pesoAEuro(double pesos) {
		double conversion = pesos * 0.053;
		JOptionPane.showMessageDialog(null, String.format("Tienes %.2f euros!",conversion),
				"Conversor de monedas by AntonioG", 1);
	}

	public void pesoALibraEsterlina(double pesos) {
		double conversion = pesos * 0.046;
		JOptionPane.showMessageDialog(null, String.format("Tienes %.2f libras esterlinas!",conversion),
				"Conversor de monedas by AntonioG", 1);
	}

	public void pesoAYenJapones(double pesos) {
		double conversion = pesos * 8.37;
		JOptionPane.showMessageDialog(null, String.format("Tienes %.2f yen japones!",conversion),
				"Conversor de monedas by AntonioG", 1);
	}

	public void pesoAWonCoreano(double pesos) {
		double conversion = pesos * 76.25;
		JOptionPane.showMessageDialog(null, String.format("Tienes %.2f won coreano",conversion),
				"Conversor de monedas by AntonioG", 1);
	}
}
