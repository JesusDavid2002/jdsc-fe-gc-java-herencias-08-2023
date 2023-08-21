package ejerciciosHerencias.ejercicio1;

public class Television extends Electrodomestico{

	private int resolucion = 20;
	private boolean sintonizadorTDT = false;
	
	public Television() {
		super();
	}
	
	public Television(double precioBase, int peso) {
		super(precioBase, peso);
	}
	
	public Television(double precioBase, String color, char consumo, int peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public double precioFinal() {
		
		double precio = super.precioFinal();
		int resolucion = this.resolucion;
		boolean TDT = this.sintonizadorTDT;
		
		if(resolucion > 40) {
			precio += (precio * 1.3);
		}
		
		if(TDT == true) {
			precio += 50;
		}
		
		return precio;
	}
	
	@Override
	public String toString() {
	    return "Televisión: " +
	    	   " precio base = " + precioBase +
	           ", precio total = " + precioFinal() +
	           " €, consumo = " + consumo +
	           ", color = " + color + 
	           ", peso = " + peso +
	           " kg, resolución = " + resolucion + 
	           " pulgadas, tiene sintonizador de TDT: " + sintonizadorTDT;
	}
	
}
