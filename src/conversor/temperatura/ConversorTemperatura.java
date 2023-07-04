package conversor.temperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public String conversorTemperaturas() {
		String[] options = {"Convertir celsius a Fahrenheit", 
				"Convertir celsius a Kelvin", 
        		"Convertir Fahrenheit a celsius",
        		"Convertir kelvin a celsius"
        		};
        String selection = (String) JOptionPane.showInputDialog
        		(null, "Seleccione una opcion de conversion", 
        				"Conversor de temperatura by AntonioG", 
        				JOptionPane.PLAIN_MESSAGE, 
        				null, options, options[0]);
        return selection;
	}

	public void celsiusFahrenheit(double temperaturaValidada) {
		double conversion = (temperaturaValidada * 9/5) + 32; 
		JOptionPane.showMessageDialog(null, String.format("Resultado de la conversion = %.2f Fahrenheit!",conversion),
				"Conversor de temperatura by AntonioG", 1);
	}

	public void celsiusKelvin(double temperaturaValidada) {
		double conversion = temperaturaValidada + 273.15;
		JOptionPane.showMessageDialog(null, String.format("Resultado de la conversion = %.2f Kelvin!",conversion),
				"Conversor de temperatura by AntonioG", 1);
	}

	public void fahrenheitCelsius(double temperaturaValidada) {
		double conversion = (temperaturaValidada - 32) * 5/9;
		JOptionPane.showMessageDialog(null, String.format("Resultado de la conversion = %.2f Celsius!",conversion),
				"Conversor de temperatura by AntonioG", 1);		
	}

	public void kelvinCelsius(double temperaturaValidada) {
		double conversion = temperaturaValidada - 273.15;
		JOptionPane.showMessageDialog(null, String.format("Resultado de la conversion = %.2f Celsius!",conversion),
				"Conversor de temperatura by AntonioG", 1);	
	}

	
}
