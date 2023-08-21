package ejerciciosHerencias.ejercicio1;

public class Electrodomestico {
	
	protected double precioBase = 100;
	protected String color = "blanco";
	protected char consumo = 'F';
	protected int peso = 5;
	
	public Electrodomestico() {}
	
	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public Electrodomestico(double precioBase, String color, char consumo, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = comprobarColor(color) ? color : "blanco";
		this.consumo = comprobarConsumoEnergetico(consumo) ? consumo : 'F';
		this.peso = peso;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public char getConsumo() {
		return consumo;
	}
	
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public boolean comprobarConsumoEnergetico(char cosumo) {
		
		char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
		boolean validado = false;
		
		for(char letra : letras) {
			if(letra == Character.toUpperCase(cosumo)) {
				validado = true;
			}
		}
		return validado;
	}
	
	public boolean comprobarColor(String color) {
		
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean validado = false;
		
		for(String colorArray : colores) {
			if(colorArray.equalsIgnoreCase(color)) {
				validado = true;
			}
		}
		return validado;
	}
	
	public double precioFinal() {
		
		double precio = this.precioBase;
		int tamano = this.peso;
		char consumo = this.consumo;
		
		switch(consumo) {
			case('A'):
				precio += 100;
				break;
			case('B'):
				precio += 80;
				break;
			case('C'):
				precio += 60;
				break;
			case('D'):
				precio += 50;
				break;
			case('E'):
				precio += 30;
				break;
			default:
				precio += 10;
			
		}
		
		if(tamano >= 0 && tamano <= 19) {
			precio += 10;
		
		} else if(tamano >= 20 && tamano <= 49) {
			precio += 50;
		
		} else if(tamano >= 50 && tamano <= 79) {
			precio += 80;
		
		} else {
			precio += 100;
			
		}
		
		return precio;
		
	}
	
	@Override
	public String toString() {
	    return "Electrodomestico: " +
	    	   " precio base = " + precioBase +
		       ", precio total = " + precioFinal() +
	           " €, consumo = " + consumo +
	           ", color = " + color + 
	           ", peso = " + peso +
	           " kg.";
	}
}
