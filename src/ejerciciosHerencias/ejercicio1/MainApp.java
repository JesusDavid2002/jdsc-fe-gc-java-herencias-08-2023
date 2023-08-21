package ejerciciosHerencias.ejercicio1;

import java.text.DecimalFormat;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat ("#.00");
		
		Electrodomestico[] electrodomestico = new Electrodomestico[5];
		Lavadora[] lavadora = new Lavadora[3];
		Television[] television = new Television[2];
		
		double precioTotalElectrodomesticos = 0;
		double precioTotalLavadoras = 0;
		double precioTotalTelevisiones = 0;
		double precioTotal = 0;
		
		electrodomestico[0] = new Electrodomestico (100, "negro", 'F', 30);
		electrodomestico[1] = new Electrodomestico (120.63, "azul", 'B', 90);
		electrodomestico[2] = new Electrodomestico (10, "blanco", 'A', 10);
		electrodomestico[3] = new Electrodomestico (906, "negro", 'B', 30);
		electrodomestico[4] = new Electrodomestico (480.2, "gris", 'C', 50);
		lavadora[0] = new Lavadora (129.99, "rojo", 'D', 50, 5);
		lavadora[1] = new Lavadora (186.12, "verde", 'D', 20, 10);
		lavadora[2] = new Lavadora (60.55, "negro", 'A', 30, 3);
		television[0] = new Television (650.20, "amarillo", 'C', 20, 26, false);
		television[1] = new Television (130.98, "negro", 'B', 30, 50, true);
		
		for(int i = 0; i < electrodomestico.length; i++) {
			precioTotalElectrodomesticos += electrodomestico[i].precioFinal();
			System.out.println(electrodomestico[i].toString());
			
		}
		System.out.println("\n----------------------------------------------------\n");
		
		for(int i = 0; i < lavadora.length; i++) {
			precioTotalLavadoras += lavadora[i].precioFinal();
			System.out.println(lavadora[i].toString());
			
		}

		System.out.println("\n----------------------------------------------------\n");
		for(int i = 0; i < television.length; i++) {
			precioTotalTelevisiones += television[i].precioFinal();
			System.out.println(television[i].toString());
			
		}
		
		precioTotal = precioTotalElectrodomesticos + precioTotalLavadoras + precioTotalTelevisiones;

		System.out.println("\n----------------------------------------------------\n");
		System.out.println("El precio total de las lavadoras es de: " + df.format(precioTotalLavadoras) + " €");
		System.out.println("El precio total de las televisiones es de: " + df.format(precioTotalTelevisiones) + " €");
		System.out.println("El precio total de todos los electrodomésticos es de: " + df.format(precioTotal) + " €");
	}

}
