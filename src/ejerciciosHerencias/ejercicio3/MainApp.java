package ejerciciosHerencias.ejercicio3;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("454585IBD", "Avanza", "Nando coronado", 250);
		Libro libro2 = new Libro("598642CDE", "Solo levelling", "Dubu", 123);

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		int numPaginas1 = libro1.getNumPaginas();
		int numPaginas2 = libro2.getNumPaginas();
		
		System.out.println("\n----------------------------------\n");
		
		if(numPaginas1 > numPaginas2) {
			System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas que " + libro2.getTitulo());
			
		} else if(numPaginas1 < numPaginas2) {
			System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas que " + libro1.getTitulo());
			
		} else {
			System.out.println("Los dos libros tienen el mismo número de páginas.");
			
		}
	}

}
