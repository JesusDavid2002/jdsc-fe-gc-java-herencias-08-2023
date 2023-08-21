package ejerciciosHerencias.ejercicioJobs;

import java.text.DecimalFormat;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat(".00");
		
		Empleado emp1 = new Empleado (Cargo.empleadoSenior, 2900);
		
		System.out.println(df.format(emp1.salarioMensual()));
		emp1.calcularSueldos();
		emp1.Prima();
	}

}
