package conversor.view;
import javax.swing.JOptionPane;

import conversor.moneda.ConversorMonedas;
import conversor.temperatura.ConversorTemperatura;
import conversor.validacion.Validacion;

public class MenuConversor{
	public static void main(String[] args) {
		boolean sigue = false;
		do {
			
		var selection = selectMenu();
		
		if (selection == "Conversor de monedas") {
			boolean validacion = false;
			
			ConversorMonedas moneda = new ConversorMonedas();
			
			do {
			String pesos = (String) JOptionPane.showInputDialog(null, 
					"Escribe la cantidad a convertir", 
					"Conversor de monedas by AntonioG", 3);	
			if(validacion = new Validacion().validarNumero(pesos)) {
				double pesoValidado = Double.parseDouble(pesos);
				String option = (String) moneda.conversorMoneda();
				
				switch(option) {
				
				case "Convertir peso mexicano a dolar":
					moneda.pesoADolar(pesoValidado);
					break;
					
				case "Convertir peso mexicano a euro":
					moneda.pesoAEuro(pesoValidado);
					break;
					
				case "Convertir peso mexicano a libra esterlina":
					moneda.pesoALibraEsterlina(pesoValidado);
					break;
					
				case "Convertir peso mexicano a yen japones":
					moneda.pesoAYenJapones(pesoValidado);
					break;
					
				case "Convertir peso mexicano a won sul-coreano":
					moneda.pesoAWonCoreano(pesoValidado);
					break;
				}
				String[] seguir = {"Si","No"};
				
				int select = JOptionPane.showOptionDialog(null, "¿Te gustaria realizar otra conversion?", 
						"Elija una opcion: ", 0, 3, null, seguir, seguir[0]);
				if(select == 0) {
					sigue = true;
				} else {
					sigue = cancelar();
				}
			}
			}while(validacion == false);
		}
		else if(selection == "Conversor de temperatura"){
			boolean validacion = false;
			
			ConversorTemperatura temp = new ConversorTemperatura();
			
			do {
			String temperatura = (String) JOptionPane.showInputDialog(null, 
					"Escribe la temperatura a convertir", 
					"Conversor de temperatura by AntonioG", 3);	
			
			if(validacion = new Validacion().validarNumero(temperatura)) {
				double temperaturaValidada = Double.parseDouble(temperatura);
				String option = (String) temp.conversorTemperaturas();
				
				switch(option) {
				
				case "Convertir celsius a Fahrenheit":
					temp.celsiusFahrenheit(temperaturaValidada);
					break;
					
				case "Convertir celsius a Kelvin":
					temp.celsiusKelvin(temperaturaValidada);
					break;
					
				case "Convertir Fahrenheit a celsius":
					temp.fahrenheitCelsius(temperaturaValidada);
					break;
					
				case "Convertir kelvin a celsius":
					temp.kelvinCelsius(temperaturaValidada);
					break;
				}
				String[] seguir = {"Si","No"};
				
				int select = JOptionPane.showOptionDialog(null, "¿Te gustaria realizar otra conversion?", 
						"Elija una opcion: ", 0, 3, null, seguir, seguir[0]);
				if(select == 0) {
					sigue = true;
				} else {
					sigue = cancelar();
				}
			}
			}while(validacion == false);
		}
		else {
			sigue = cancelar();
		}
		} while(sigue);
	}
	
	public static String selectMenu() {
		String[] select = {"Conversor de monedas",
				"Conversor de temperatura"
		};
		
		String selectDropDown = (String) JOptionPane.showInputDialog(null,
				"Seleccione una opcion",
				"Conversor by AntonioG", JOptionPane.PLAIN_MESSAGE,
				null, select, select[0]);
		
		return selectDropDown;
	}
	
	public static boolean cancelar() {
		JOptionPane.showMessageDialog(null, "Programa Finalizado!");
		return false;
	}
}
