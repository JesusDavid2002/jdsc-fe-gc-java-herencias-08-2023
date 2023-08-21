package ejerciciosHerencias.ejercicio5;

public class Estudiante extends Persona{
	
	private int calificacion;
	
	public Estudiante(String nombre, int edad, char sexo, int nota) {
		super(nombre, edad, sexo);
		this.calificacion = nota;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public boolean disponible() {
		double resultado = Math.floor((Math.random() * (1 - 0 + 1)) + 0);
	    return resultado != 0;
	}	
	
}
