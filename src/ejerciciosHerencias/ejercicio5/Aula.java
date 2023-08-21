package ejerciciosHerencias.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Aula {
	
	private int id;
	private int maxEstudiantes;
	private String materia;
	private Profesor profesor;
	private List<Estudiante> estudiantes;
	
	public Aula(int id, int maxEstudiantes, String materia, Profesor profesor) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.estudiantes = new ArrayList<>();
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}


	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}



	public boolean puedeDarClase() {
		
		if(!profesor.disponible()) {
			return false;
		}
		
		if(!profesor.getMateria().equals(materia)) {
			return false;
		}
		
		int numEstudiantes = estudiantes.size();
		double numEstudiantesPresentes = estudiantes.stream().filter(Estudiante::disponible).count();
		
		if(numEstudiantesPresentes / numEstudiantes < 0.5) {
			return false;
		}
		
		return true;
	}
}
