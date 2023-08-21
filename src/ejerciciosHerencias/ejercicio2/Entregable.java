package ejerciciosHerencias.ejercicio2;

public interface Entregable {
	
	public static boolean entregar() {
		return true;
	}
	
	public static boolean devolver() {
		return false;
	}
	
	public static boolean isEntregado() {
		return true;
	}

	int compareTo(Object o);
}
