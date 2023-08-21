package ejerciciosHerencias.ejercicio5;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profesor = new Profesor ("Juanjo", 30, 'H', "Matematicas");
		
		Estudiante[] alumnos = {
	            new Estudiante("Marco", 8, 'H', 5),
	            new Estudiante("David", 13, 'H', 8),
	            new Estudiante("Julian", 10, 'H', 6),
	            new Estudiante("Marta", 9, 'M', 3),
	            new Estudiante("Mireia", 15, 'M', 5),
	    };
		
		Aula aula = new Aula(15, 10, "Matematicas", profesor);

	        if (aula.puedeDarClase()) {
	            System.out.println("Se puede dar clase.");

	            int alumnasM = 0;
	            int alumnosH = 0;

	            for (Estudiante estudiante : alumnos) {
	                if (estudiante.getCalificacion() >= 5) {
	                    if (estudiante.getSexo() == 'M') {
	                        alumnasM++;
	                    } else {
	                        alumnosH++;
	                    }
	                }
	            }

	            System.out.println("Las alumnas aprobadas son " + alumnasM);
	            System.out.println("Los alumnos aprobados son " + alumnosH);
	        } else {
	            System.out.println("No se puede dar clase.");
	        }
	    }
	}


