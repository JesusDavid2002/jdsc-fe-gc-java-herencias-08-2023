package ejerciciosHerencias.ejercicioVehicles;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String color;
	private TitularVehiculo titular;
	private ArrayList<Persona> conductores;
	
	public Vehiculo() {}
	
	public Vehiculo(String matricula, String marca, String color, TitularVehiculo titular) {
		this.matricula = validarMatricula(matricula);
        this.marca = marca;
		this.color = color;
		this.titular = titular;
		this.conductores = new ArrayList<>();
	}	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = validarMatricula(matricula);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public TitularVehiculo getTitular() {
		return titular;
	}

	public void setTitular(TitularVehiculo titular) {
		this.titular = titular;
	}

	public ArrayList<Persona> getConductores() {
		return conductores;
	}

	public void addConductor(Persona conductor) {
		this.conductores.add(conductor);
	}

	// d{4} especificamos que haya 4 digitos
	// [A-Za-z]{2,3} dice que esos hay 2 o 3 letras dentro de esos parametros
	private String validarMatricula(String matricula) {
		
		 if (matricula.matches("\\d{4}[A-Za-z]{2,3}")) {
	            return matricula;
	        } else {
	        	 JOptionPane.showMessageDialog(null,  "Matrícula no válida. Debe tener 4 números y 2 o 3 letras.");
	        	 return null;
	        }
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "La matricula es " + matricula + " marca: " + marca + " color: " + color ;
	}
	
}
