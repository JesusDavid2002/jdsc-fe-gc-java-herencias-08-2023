package ejerciciosHerencias.ejercicio4;

public class Raices {
	
	private int a;
	private int b;
	private int c;
	
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminante() {
		return (Math.pow(this.b, 2)) - (4 * this.a * this.c);
	}
	
	public boolean tieneRaices() {
		return this.getDiscriminante() >= 0;
	}
	
	public boolean tieneRaiz() {
		return this.getDiscriminante() == 0;
	}
	
	public void calcular() {
		double discriminante = this.getDiscriminante();
		
		if(this.tieneRaices()) {
			double solucion1 = (- this.b + Math.sqrt(discriminante) / (2 * this.a));
			double solucion2 = (- this.b - Math.sqrt(discriminante) / (2 * this.a));
			this.obtenerRaices(solucion1, solucion2);
			
		} else if(this.tieneRaiz()) {
			double result = - this.b / (2 * this.a);
			this.obtenerRaiz(result);
			
			
		} else {
			System.out.println("No existe solución.");
			
		}
	}

	private void obtenerRaiz(double result) {	
		// TODO Auto-generated method stub
		System.out.println("Resultado = " + result);
	}
	
	private void obtenerRaices(double solucion1, double solucion2) {	
		// TODO Auto-generated method stub
		System.out.println("1r resultado = " + solucion1);
		System.out.println("2n resultado = " + solucion2);
	}
}
