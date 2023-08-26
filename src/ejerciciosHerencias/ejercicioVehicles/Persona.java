package ejerciciosHerencias.ejercicioVehicles;

public class Persona {
	
	protected String nombre;
	protected String apellidos;
	protected String fechaNacimiento;
	protected String licenciaConducir;
	
	public Persona(String nombre, String apellidos, String fechaNacimiento, String licenciaConducir) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.licenciaConducir = licenciaConducir;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getLicenciaConducir() {
		return licenciaConducir;
	}

	public void setLicenciaConducir(String licenciaConducir) {
		this.licenciaConducir = licenciaConducir;
	}
	
}
