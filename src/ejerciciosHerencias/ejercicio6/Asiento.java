package ejerciciosHerencias.ejercicio6;

public class Asiento {
	
	private boolean estaOcupado;
	private char letraButaca;
	private int numeroButaca;
	
	
	public Asiento( boolean estaOcupado) {
		this.estaOcupado = estaOcupado;
	}

	public Asiento(int numeroButaca, char letraButaca) {
		this.numeroButaca = numeroButaca;
		this.letraButaca = letraButaca;
	}

	public boolean isEstaOcupado() {
		return estaOcupado;
	}

	public void setEstaOcupado(boolean estaOcupado) {
		this.estaOcupado = estaOcupado;
	}
	 @Override
	    public String toString() {
	        return "Asiento " + letraButaca + numeroButaca + (estaOcupado ? " (Ocupado)" : " (Libre)");
	    }
}
