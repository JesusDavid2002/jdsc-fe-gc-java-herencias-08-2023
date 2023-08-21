package ejerciciosHerencias.ejercicio2;

public class Videojuego implements Entregable{
	
	private String titulo = "";
	private int horasEstimadas = 10;
	private boolean entregado = false;
	private String genero = "";
	private String compania = "";
	
	public Videojuego() {}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getCompania() {
		return compania;
	}
	
	public void setCompañia(String compania) {
		this.compania = compania;
	}
	
	@Override
	public String toString() {
		 return " título = " + titulo +
			       ", horas estimadas = " + horasEstimadas +
		           " , genero = " + genero +
		           ", compañía = " + compania + 
		           ", esta entregado? " + entregado;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Videojuego) {
            Videojuego other = (Videojuego) o;
            return Integer.compare(this.horasEstimadas, other.horasEstimadas);
        }
        return 0;
	}
	
	public boolean entregar() {
		// TODO Auto-generated method stub
		return this.entregado = true;
	}
	
	public boolean devolver() {
		// TODO Auto-generated method stub
		return this.entregado = false;
	}
	
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
	}
}
