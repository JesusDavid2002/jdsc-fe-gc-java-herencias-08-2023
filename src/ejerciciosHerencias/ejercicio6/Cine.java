package ejerciciosHerencias.ejercicio6;

public class Cine extends Pelicula{
	
	private double precioEntrada;
	private Asiento[][] asientos;
	
	public Cine(String titulo, int duracion, int edadMinima, String director, double precioEntrada) {
		super(titulo, duracion, edadMinima, director);
		this.precioEntrada = precioEntrada;
		this.asientos = rellenarAsientos();
	}

	public Asiento[][] getAsientos() {
		return asientos;
	}


	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	private Asiento[][] rellenarAsientos() {
		
		char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
		int[] numeros = {8, 7, 6, 5, 4, 3, 2, 1};
		Asiento[][] asientos = new Asiento [numeros.length][letras.length];

		for(int fila = 0; fila < numeros.length; fila++) {
			
			for(int columna = 0; columna < letras.length; columna++) {
				asientos[fila][columna] = new Asiento(numeros[fila], letras[columna]);
			}
		}
		
		return asientos;
	}
}
