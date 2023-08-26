package ejerciciosHerencias.ejercicioVehicles;

public class Licencia {
	
	private int ID;
	private String tipoLicencia;
	private String nombreCompleto;
	private String fechaCaducidad;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTipoLicencia() {
		return tipoLicencia;
	}
	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	
}
