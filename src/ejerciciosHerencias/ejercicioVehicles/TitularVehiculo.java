package ejerciciosHerencias.ejercicioVehicles;

public class TitularVehiculo extends Persona{

	private boolean seguro;
	private boolean garaje;
	
	public TitularVehiculo(String nombre, String apellidos, String fechaNacimiento, String licencia, boolean seguro, boolean garaje) {
		super(nombre, apellidos, fechaNacimiento, licencia);
		this.seguro = seguro;
		this.garaje = garaje;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public boolean isGaraje() {
		return garaje;
	}

	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}
	

}