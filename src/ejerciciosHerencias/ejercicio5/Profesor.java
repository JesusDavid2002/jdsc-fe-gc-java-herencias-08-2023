package ejerciciosHerencias.ejercicio5;

public class Profesor extends Persona implements Materias {
	
	private String materia;
	
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = comprobarMateria(materia);
	}
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public String comprobarMateria(String materia) {
		
		switch(materia) {
		case Materias.mates:
			materia = "Matematicas";
			break;
		
		case Materias.filo:
			materia = "Filosofia";
			break;
		
		case Materias.fisica:
			materia = "Fisica";
			break;
			
		default:
			System.out.println("Esa no es una asignatura.");
		}
		
		return materia;
	}

	
	
	public boolean disponible() {
		double resultado = Math.floor((Math.random() * (5 - 0 + 1)) + 0);
		if(resultado == 1) {
			return false;
			
		} else {
			return true;
			
		}
	}
	
}
