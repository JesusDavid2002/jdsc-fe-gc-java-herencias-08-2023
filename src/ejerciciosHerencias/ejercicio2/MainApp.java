package ejerciciosHerencias.ejercicio2;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie[] serie = new Serie[5];
		Videojuego[] videojuego = new Videojuego[5];
		int acumuladorSeries = 0;
		int acumuladorJuegos = 0;
		
		serie[0] = new Serie("Breaking Bad", 3, "ciencia", "steven");
		serie[1] = new Serie("NCIS", 7, "policias y acción", "maclaren");
		serie[2] = new Serie("Juego de Tronos", 10, "acción", "David Benioff");
		serie[3] = new Serie("Peaky Blinders", 6, "historia, acción","Cillian Murphy");
		serie[4] = new Serie("Los Soprano", 5, "comedia", "Magregor");
		Serie serieMasTemporadas = serie[0];
		
		videojuego[0] = new Videojuego("GTA V", 250, "acción, mundo abiert", "Rockstar games");
		videojuego[1] = new Videojuego("Dead by Daylight", 1000, "pvp, horror", "Behaviour");
		videojuego[2] = new Videojuego("Battelfield 1", 643, "pvp, acción, multijugador", "EA");
		videojuego[3] = new Videojuego("Valorant", 6400, "multijugador, pvp, shooter", "Riot Games");
		videojuego[4] = new Videojuego("League of Legends", 6500, "pvp, multijugador", "Riot Games");
		Videojuego juegoMasHoras = videojuego[0];
		
		serie[0].entregar();
		serie[3].entregar();
		serie[2].entregar();
		videojuego[2].entregar();
		videojuego[4].entregar();
		
		for(int i = 0; i < serie.length; i++) {
			
			if(serie[i].isEntregado()) {
				serie[i].devolver();
				acumuladorSeries ++;
			}
			
			if(serie[i].compareTo(serieMasTemporadas) > 0) {
				serieMasTemporadas = serie[i];
			}
			
		}
		
		for(int i = 0; i < videojuego.length; i++) {
			
			if(videojuego[i].isEntregado()) {
				videojuego[i].devolver();
				acumuladorJuegos ++;
			}
			
			if(videojuego[i].compareTo(juegoMasHoras) > 0) {
				juegoMasHoras = videojuego[i];
			}
		}
		
		System.out.println("Hay entregadas " + acumuladorSeries + " series y ya han sido devueltos.");
		System.out.println("Hay entregados " + acumuladorJuegos + " videojuegos y ya han sido devueltos.");
		System.out.println("\n---------------------------------------------------------------\n");
		System.out.println("La serie con más temporadas es: " + serieMasTemporadas.toString());
		System.out.println("El videojuego con más horas es: " + juegoMasHoras.toString());

	}

}
 