package ejerciciosHerencias.ejercicioVehicles;

import java.util.*;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		
		ArrayList<Persona> personas = new ArrayList<>();
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		
		Vehiculo coche = new Vehiculo();
		Vehiculo moto = new Vehiculo();
		Vehiculo camion = new Vehiculo();
		
		Rueda[] ruedasCoche = new Rueda[4];
		Rueda[] ruedasMoto = new Rueda[2];
		Rueda[] ruedasCamion = new Rueda[10];
		
		//TitularVehiculo titular1 = new TitularVehiculo("Juan", "Pedro Osborne","15-5-1998", "B", true, true);
		
		while(true) {
			String[] opcionesMenu = {"Crear Persona", "Crear Vehículo", "Finalizar"};
			int opcion = JOptionPane.showOptionDialog(
					null, 
					"Selecciona una opción", 
					"", 
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE,
					null,
					opcionesMenu,
					opcionesMenu[0]
			);
			
			if(opcion == 0) {
				 // Crear una persona
                System.out.print("Nombre: ");
                String nombre = scn.next();
                System.out.print("Apellidos: ");
                String apellidos = scn.next();
                System.out.print("Fecha de nacimiento: ");
                String fechaNacimiento = scn.next();
                System.out.print("Tipo de licencia (A/B/C): ");
                String licenciaConducir = scn.next();
                
                System.out.println("¿Es titular de vehículo? (s/n)");
                String esTitular = scn.next();
                
                if(esTitular.equalsIgnoreCase("s")) {
                	 System.out.print("¿Tiene seguro? (true/false): ");
	                boolean seguro = scn.nextBoolean();
	                System.out.print("¿Tiene garaje? (true/false): ");
	                boolean garaje = scn.nextBoolean();
	                TitularVehiculo titular = new TitularVehiculo(nombre, apellidos, fechaNacimiento, licenciaConducir, seguro, garaje);
	                personas.add(titular);
	                System.out.println("Titular creado y agregada.");
	                
	            } else {
	            	Persona persona = new Persona(nombre, apellidos, fechaNacimiento, licenciaConducir);
	                personas.add(persona);
	                System.out.println("Persona creada y agregada.");
	            }
            
			} else if(opcion == 1) {
				String[] opciones = {"Coche", "Moto", "Camión"};
				int opcionCoche = JOptionPane.showOptionDialog(
						null, 
						"Selecciona una opción", 
						"", 
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE,
						null,
						opciones,
						opciones[0]
				);
				
				if(opciones[opcionCoche].equals("Coche")) {
					String matricula = JOptionPane.showInputDialog("Introduce la matricula del coche: ");
                    String marca = JOptionPane.showInputDialog("Introduce la marca del coche: ");
                    String color = JOptionPane.showInputDialog("Introduce el color del coche: ");

                   
					for(int i = 0; i < ruedasCoche.length; i++) {
						
						ruedasCoche[i] = new Rueda();
						String marcaRueda = JOptionPane.showInputDialog("Introduce la marca de la rueda: ");
						ruedasCoche[i].setMarca(marcaRueda);
						String diametroRueda = JOptionPane.showInputDialog("Introduce el diametro de la rueda: ");
						ruedasCoche[i].setDiametro(Double.parseDouble(diametroRueda));
						
						if(i < 2) {
							String posicion = "delantera";
							ruedasCoche[i].setPosicion(posicion);
						} else {
							String posicion = "trasera";
							ruedasCoche[i].setPosicion(posicion);
						}
						
						System.out.println(ruedasCoche[i].toString());
					}
					
					// SELECCIONAR TITULAR
					 System.out.println("Selecciona el titular del vehículo:");
					 try {
						 for (int i = 0; i < personas.size(); i++) {
		                        System.out.println((i + 1) + ". " + personas.get(i).getNombre());
		                    }
		                    int indexTitular = scn.nextInt() - 1;
		                    scn.nextLine();  

		                    while(true) {
		                    	 if (personas.get(indexTitular) instanceof TitularVehiculo) {
		                    		 TitularVehiculo titular = (TitularVehiculo) personas.get(indexTitular);
		                    		 Vehiculo vehiculo = new Vehiculo(matricula, marca, color, titular);
	
			                         System.out.println("Selecciona un conductor:");
			                         for (int i = 0; i < personas.size(); i++) {
			                            System.out.println((i + 1) + ". " + personas.get(i).getNombre());
			                        }
			                        int indexConductor = scn.nextInt() - 1;
			                        scn.nextLine();  
			                        
			                        Persona conductor = personas.get(indexConductor);
	
			                        if (conductor.getLicenciaConducir().equals("B")) {
			                            vehiculo.addConductor(conductor);
			                            System.out.println("Conductor agregado al vehículo.");
			                        } else {
			                            System.out.println("El conductor no tiene la licencia adecuada para este vehículo.");
			                        }
	
			                        System.out.println("¿Deseas añadir otro conductor? (s/n)");
			                        String continuar = scn.nextLine();
			                        if (continuar.equals("n")) {
			                            break;
			                        }
			                        vehiculos.add(vehiculo);
			                        System.out.println("Vehículo creado y agregado.");
			                    } else {
			                        System.out.println("La licencia de conducir no es de coche");
			                        break;
			                    }
		                    }
		                   
		                    
					 } catch (Exception e) {
						System.out.println("Esa persona no es títular"); 
					 }	
				}
				
				if(opciones[opcionCoche].equals("Moto")) {
					
					String matricula = JOptionPane.showInputDialog("Introduce la matricula de la moto: ");
					String marca = JOptionPane.showInputDialog("Introduce la marca de la moto: ");
					String color = JOptionPane.showInputDialog("Introduce el color de la moto: ");
					
					for(int i = 0; i < ruedasMoto.length; i++) {
						
						ruedasMoto[i] = new Rueda();
						String marcaRueda = JOptionPane.showInputDialog("Introduce la marca de la rueda: ");
						ruedasMoto[i].setMarca(marcaRueda);
						String diametroRueda = JOptionPane.showInputDialog("Introduce el diametro de la rueda: ");
						ruedasMoto[i].setDiametro(Double.parseDouble(diametroRueda));
						
						if(i < 1) {
							String posicion = "delantera";
							ruedasMoto[i].setPosicion(posicion);
						} else {
							String posicion = "trasera";
							ruedasMoto[i].setPosicion(posicion);
						}
						
						System.out.println(ruedasMoto[i].toString());
					}
					
				 // SELECCIONAR TITULAR
				 System.out.println("Selecciona el titular del vehículo:");
				 try {
					 for (int i = 0; i < personas.size(); i++) {
	                        System.out.println((i + 1) + ". " + personas.get(i).getNombre());
	                    }
	                    int indexTitular = scn.nextInt() - 1;
	                    scn.nextLine();  

	                    while(true) {
	                    	 if (personas.get(indexTitular) instanceof TitularVehiculo) {
	                    		 TitularVehiculo titular = (TitularVehiculo) personas.get(indexTitular);
	                    		 Vehiculo vehiculo = new Vehiculo(matricula, marca, color, titular);

		                         System.out.println("Selecciona un conductor:");
		                         for (int i = 0; i < personas.size(); i++) {
		                            System.out.println((i + 1) + ". " + personas.get(i).getNombre());
		                        }
		                        int indexConductor = scn.nextInt() - 1;
		                        scn.nextLine();  
		                        
		                        Persona conductor = personas.get(indexConductor);

		                        if (conductor.getLicenciaConducir().equals("B")) {
		                            vehiculo.addConductor(conductor);
		                            System.out.println("Conductor agregado al vehículo.");
		                        } else {
		                            System.out.println("El conductor no tiene la licencia adecuada para este vehículo.");
		                        }

		                        System.out.println("¿Deseas añadir otro conductor? (s/n)");
		                        String continuar = scn.nextLine();
		                        if (continuar.equals("n")) {
		                            break;
		                        }
		                        vehiculos.add(vehiculo);
		                        System.out.println("Vehículo creado y agregado.");
		                    } else {
		                        System.out.println("La licencia de conducir no es de moto");
		                        break;
		                    }
	                    }
	                    
					 } catch (Exception e) {
						System.out.println("Esa persona no es títular"); 
					 }	
				}
				
				if(opciones[opcionCoche] == "Camión") {
					
					String matricula = JOptionPane.showInputDialog("Introduce la matricula del camión: ");
					camion.setMatricula(matricula);
					String marca = JOptionPane.showInputDialog("Introduce la marca del camión: ");
					camion.setMarca(marca);
					String color = JOptionPane.showInputDialog("Introduce el color de la camión: ");
					camion.setColor(color);
					
					for(int i = 0; i < ruedasCamion.length; i++) {
						
						ruedasCamion[i] = new Rueda();
						String marcaRueda = JOptionPane.showInputDialog("Introduce la marca de la rueda: ");
						ruedasCamion[i].setMarca(marcaRueda);
						String diametroRueda = JOptionPane.showInputDialog("Introduce el diametro de la rueda: ");
						ruedasCamion[i].setDiametro(Double.parseDouble(diametroRueda));
						
						if(i < 6) {
							String posicion = "delantera";
							ruedasCamion[i].setPosicion(posicion);
						} else {
							String posicion = "trasera";
							ruedasCamion[i].setPosicion(posicion);
						}
						
						System.out.println(ruedasCamion[i].toString());
						
					}
					
					 // SELECCIONAR TITULAR
					 System.out.println("Selecciona el titular del vehículo:");
					 try {
						 for (int i = 0; i < personas.size(); i++) {
		                        System.out.println((i + 1) + ". " + personas.get(i).getNombre());
		                    }
		                    int indexTitular = scn.nextInt() - 1;
		                    scn.nextLine();  

		                    while(true) {
		                    	 if (personas.get(indexTitular) instanceof TitularVehiculo) {
		                    		 TitularVehiculo titular = (TitularVehiculo) personas.get(indexTitular);
		                    		 Vehiculo vehiculo = new Vehiculo(matricula, marca, color, titular);

			                         System.out.println("Selecciona un conductor:");
			                         for (int i = 0; i < personas.size(); i++) {
			                            System.out.println((i + 1) + ". " + personas.get(i).getNombre());
			                        }
			                        int indexConductor = scn.nextInt() - 1;
			                        scn.nextLine();  
			                        
			                        Persona conductor = personas.get(indexConductor);

			                        if (conductor.getLicenciaConducir().equals("B")) {
			                            vehiculo.addConductor(conductor);
			                            System.out.println("Conductor agregado al vehículo.");
			                        } else {
			                            System.out.println("El conductor no tiene la licencia adecuada para este vehículo.");
			                        }

			                        System.out.println("¿Deseas añadir otro conductor? (s/n)");
			                        String continuar = scn.nextLine();
			                        if (continuar.equals("n")) {
			                            break;
			                        }
			                        vehiculos.add(vehiculo);
			                        System.out.println("Vehículo creado y agregado.");
			                    } else {
			                        System.out.println("La licencia de conducir no es de camión");
			                        break;
			                    }
		                    }
	  
						 } catch (Exception e) {
							System.out.println("Esa persona no es títular"); 
						 }	
					}
				
				
			} else if (opcion == 2) {
				break;
			}
		}
	}	
}
