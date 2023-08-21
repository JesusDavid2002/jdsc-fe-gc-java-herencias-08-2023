package ejerciciosHerencias.ejercicio6;

public class MainApp {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Five Nights at Freddy", 120, 12, "Abraham Mateo");
        Cine cine = new Cine("Five Nights at Freddy", 120, 12, "Abraham Mateo", 8);

        Espectador[] espectadores = {
            new Espectador("Antonio", 30, 500),
            new Espectador("Maria", 15, 20),
            new Espectador("Fausto", 14, 18),
            new Espectador("Roberto", 27, 3),
            new Espectador("Esther", 21, 2),
            new Espectador("Agustín", 84, 10),
            new Espectador("Juanjo", 32, 81),
            new Espectador("Jose Miguel", 10, 23),
            new Espectador("Antonio", 30, 500),
            new Espectador("Maria", 15, 20),
            new Espectador("Fausto", 14, 18),
            new Espectador("Roberto", 27, 3),
            new Espectador("Esther", 21, 2),
            new Espectador("Agustín", 84, 10),
            new Espectador("Juanjo", 32, 81),
            new Espectador("Jose Miguel", 10, 23)
        };

        Asiento[][] asientos = cine.getAsientos();

        for (Espectador espectador : espectadores) {
            boolean asientoOcupado = true;

            if (espectador.getDinero() >= cine.getPrecioEntrada() && espectador.getEdad() >= pelicula.getEdadMinima()) {
                while (asientoOcupado) {
                    int fila = (int) (Math.random() * asientos.length);
                    int columna = (int) (Math.random() * asientos[0].length);

                    if (!asientos[fila][columna].isEstaOcupado()) {
                        asientos[fila][columna].setEstaOcupado(true);
                        System.out.println("El asiento " + asientos[fila][columna] + " ha sido asignado al espectador " + espectador.getNombre());
                        asientoOcupado = false;
                    }
                }
            }
        } 

        System.out.println("\n-----------------------------------------\n"); 
        for (int fila = 0; fila < asientos.length; fila++) {
            for (int columna = 0; columna < asientos[0].length; columna++) {
                System.out.print(asientos[fila][columna] + " | ");
            }
            System.out.println(); 
        }
    }

}
