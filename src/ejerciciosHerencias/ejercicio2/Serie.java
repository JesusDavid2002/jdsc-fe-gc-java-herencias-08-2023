package ejerciciosHerencias.ejercicio2;

public class Serie implements Entregable{

	private String titulo = "";
	private int numTemporadas = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";
	
	public Serie() {}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		 return " título = " + titulo +
			       ", número de temporadas = " + numTemporadas +
		           " , genero = " + genero +
		           ", creador = " + creador + 
		           ", esta entregado? " + entregado;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Serie) {
			Serie other = (Serie) o;
            return Integer.compare(this.numTemporadas, other.numTemporadas);
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
