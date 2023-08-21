package ejerciciosHerencias.ejercicioJobs;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Empleado implements Cargo{

	DecimalFormat df = new DecimalFormat(".00");
	
	private String tipoEmpleado;
	private double sueldo;
	
	
	public Empleado(String tipoEmpleado, double sueldo) {
		this.tipoEmpleado = comprobadorPuesto(tipoEmpleado);
		this.sueldo = validarSalario(sueldo);
	}


	public String comprobadorPuesto(String puesto) {
		
		switch(puesto) {
		case (Cargo.jefe):
			puesto = "Boss";
			break;
			
		case (Cargo.manager):
			puesto = "Manager";
			break;
			
		case (Cargo.empleadoSenior):
			puesto = "Senior";
			break;
			
		case (Cargo.empleadoMid):
			puesto = "Mid";
			break;
			
		case (Cargo.empleadoJunior):
			puesto = "Junior";
			break;
			
		case (Cargo.voluntario):
			puesto = "Volunteer";
			break;
			
		}
		
		return puesto;
	}
	
	
	public double salarioMensual() {
				
		if (this.tipoEmpleado == "Boss") {
			this.sueldo *= 1.50;
			
		} else if (this.tipoEmpleado == "Manager") {
			this.sueldo *= 1.10;
			
		}  else if (this.tipoEmpleado == "Junior") {
			this.sueldo /= 1.15;
			
		} else if (this.tipoEmpleado == "Mid") {
			this.sueldo /= 1.10;
			
		} else if (this.tipoEmpleado == "Senior") {
			this.sueldo /= 1.05;
			
		} else {
			this.sueldo = 0;
		}
		
		return this.sueldo;
	}
	
	
	private double validarSalario(double sueldo)  {
		
		String puesto = this.tipoEmpleado;
		
		switch(puesto) {	
		case (Cargo.jefe):
			
			if(sueldo < 8000) {
				JOptionPane.showMessageDialog(null, "El jefe debería de ganar más de 8000");
			}
			break;
			
		case (Cargo.manager):
			
			if(sueldo < 3000) {
				JOptionPane.showMessageDialog(null, "El manager debería de ganar más de 3000");
				
			} else if(sueldo > 5000) {
				JOptionPane.showMessageDialog(null, "El manager debería de ganar menos de 5000");
				
			}
			break;
		
		case (Cargo.empleadoSenior):
			
			if(sueldo < 2700) {
				JOptionPane.showMessageDialog(null, "El senior debería de ganar más de 2700");
				
			} else if(sueldo > 4000) {
				JOptionPane.showMessageDialog(null, "El senior debería de ganar menos de 4000");
				
			}
			break;
			
		case (Cargo.empleadoMid):

			if(sueldo < 1800) {
				JOptionPane.showMessageDialog(null, "El mid debería de ganar más de 1800");
				
			} else if(sueldo > 2500) {
				JOptionPane.showMessageDialog(null, "El mid debería de ganar menos de 2500");
				
			}
			break;
			
		case (Cargo.empleadoJunior):

			if(sueldo < 900) {
				JOptionPane.showMessageDialog(null, "El junior debería de ganar más de 900");
				
			} else if(sueldo > 1600) {
				JOptionPane.showMessageDialog(null, "El junior debería de ganar menos de 1600");
				
			}
			break;
			
		case (Cargo.voluntario):
			
			if(sueldo != 0) {
				JOptionPane.showMessageDialog(null, "El voluntario no debería de cobrar");
				
			}
			break;
		}
		return sueldo;
	}
	
	
	public void calcularSueldos() {

		
		double salarioMensual = this.sueldo;
		String puesto = this.tipoEmpleado;
		double salarioNetoMensual = 0;
		double salarioAnual = 0;
		double salarioNetoAnual = 0;
		
		switch(puesto) {	
		case (Cargo.jefe):
			
			salarioNetoMensual = salarioMensual / 1.32;
			System.out.println("Mensualmente cobra netos " + df.format(salarioNetoMensual) + "€");
			
			salarioAnual = salarioMensual * 12;
			salarioNetoAnual = salarioAnual / 1.32;
			System.out.println("Anualmente cobra netos " + df.format(salarioNetoAnual) + "€");
			break;
			
		case (Cargo.manager):
			
			salarioNetoMensual = salarioMensual / 1.26;
			System.out.println("Mensualmente cobra netos " + df.format(salarioNetoMensual) + "€");
			
			salarioAnual = salarioMensual * 12;
			salarioNetoAnual = salarioAnual / 1.26;
			System.out.println("Anualmente cobra netos " + df.format(salarioNetoAnual) + "€");
			break;
		
		case (Cargo.empleadoSenior):
			
			salarioNetoMensual = salarioMensual / 1.24;
			System.out.println("Mensualmente cobra netos " + df.format(salarioNetoMensual) + "€");

			salarioAnual = salarioMensual * 12;
			salarioNetoAnual = salarioAnual / 1.24;
			System.out.println("Anualmente cobra netos " + df.format(salarioNetoAnual) + "€");
			break;
			
		case (Cargo.empleadoMid):

			salarioNetoMensual = salarioMensual / 1.15;
			System.out.println("Mensualmente cobra netos " + df.format(salarioNetoMensual) + "€");

			salarioAnual = salarioMensual * 12;
			salarioNetoAnual = salarioAnual / 1.15;
			System.out.println("Anualmente cobra netos " + df.format(salarioNetoAnual) + "€");
			break;
			
		case (Cargo.empleadoJunior):

			salarioNetoMensual = salarioMensual / 1.02;
			System.out.println("Mensualmente cobra netos " + df.format(salarioNetoMensual) + "€");

			salarioAnual = salarioMensual * 12;
			salarioNetoAnual = salarioAnual / 1.02;
			System.out.println("Anualmente cobra netos " + df.format(salarioNetoAnual) + "€");
			break;
			
		case (Cargo.voluntario):
			
			int adjunto = JOptionPane.showConfirmDialog(null,"¿El voluntario es adjunto?", "",JOptionPane.YES_NO_OPTION);
			
			if(adjunto == JOptionPane.YES_OPTION) {
				salarioMensual = 300;
			}
			
			break;
		}
		
	}
	
	
	public void Prima() {
		
		String puesto = this.tipoEmpleado;
		
		if(puesto != Cargo.voluntario) {
			double salario = this.sueldo * 12;
			salario *= 0.10;
			System.out.println("La prima del empleado es de " + df.format(salario) + "€");
		}
		
	}
	
	
}
