package ejerciciosHerencias.ejercicio1;

public class Lavadora extends Electrodomestico{
	
	private int carga = 5;

	public Lavadora() {
		super();
	}

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, String color, char consumo, int peso, int carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public double precioFinal() {
		
		double precio = super.precioFinal();
		int carga = this.carga;
		
		if(carga > 30) {
			precio += 50;
		}
		
		return precio;
	}
	
	@Override
	public String toString() {
	    return "Lavadora: " +
	    	   " precio base = " + precioBase +
		       ", precio total = " + precioFinal() +
	           " €, consumo = " + consumo +
	           ", color = " + color + 
	           ", peso = " + peso +
	           " kg, carga = " + carga;
	}
	
}
