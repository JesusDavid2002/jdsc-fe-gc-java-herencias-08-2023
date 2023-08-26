package ejerciciosHerencias.ejercicioVehicles;

import javax.swing.JOptionPane;

public class Rueda {
	
	private String posicion;
	private String marca;
	private double diametro;
	
	public Rueda() {}
	
	public Rueda(String posicion, String marca, double diametro) {
		this.posicion = posicion;
		this.marca = marca;
		this.diametro = validarDiametro(diametro);
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = validarDiametro(diametro);
	}
	
	public double validarDiametro(double diametro) {
		
		if(diametro > 0.4 && diametro < 4) {
			return diametro;
       	 	
       }else {
    	    JOptionPane.showMessageDialog(null,  "Diámetro incorrecto");
       	 	return 0;
    	   
       }
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "La marca de la rueda es " + marca + " tiene un diametro de " + diametro + " cm y es rueda " + posicion ;
	}
	
}
