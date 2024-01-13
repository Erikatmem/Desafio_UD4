
import java.util.Scanner;

public class Gestion {
    private static Piloto pilotoUsuario1;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crea tres objetos de la clase Piloto
        Piloto maverick = new Piloto(1, "Pete Maverick", 10000, "Capitán");
        Piloto phoenix = new Piloto(2, "Natasha Phoenix", 3000, "Teniente");
        Piloto rooster = new Piloto(3, "Bradley Rooster", 3500, "Teniente");

        // Muestra la información de algunos pilotos
        System.out.println("Información de Maverick:");
        maverick.mostrarPiloto();

        System.out.println("\nInformación de Rooster:");
        rooster.mostrarPiloto();

        // Pide al usuario que introduzca los datos de otros dos pilotos
        System.out.println("\nIntroduce los datos de otros dos pilotos:");
        System.out.print("ID: ");
        int idPilotoUsuario1 = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer
        System.out.print("Nombre: ");
        String nomPilotoUsuario1 = scanner.nextLine();
        System.out.print("Horas de vuelo: ");
        int horasVueloUsuario1 = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer
        System.out.print("Rango: ");
        String rangoUsuario1 = scanner.nextLine();

        setPilotoUsuario1(new Piloto(idPilotoUsuario1, nomPilotoUsuario1, horasVueloUsuario1, rangoUsuario1));

        // Crea tres objetos de la clase Avion
        Avion avionEntrenamiento1 = new Entrenamiento(101, "Entrenamiento 1", 2, maverick, true);
        Avion avionCombate1 = new Combate(201, "Combate 1", 1, phoenix, false);
        Avion avionCombate2 = new Combate(202, "Combate 2", 1, rooster, true);

        // Muestra toda la información de los aviones
        System.out.println("\nInformación de avión de entrenamiento:");
        avionEntrenamiento1.mostrarAvion();

        System.out.println("\nInformación de avión de combate 1:");
        avionCombate1.mostrarAvion();

        System.out.println("\nInformación de avión de combate 2:");
        avionCombate2.mostrarAvion();

        // Pide al usuario que introduzca la información de dos aviones
        System.out.println("\nIntroduce los datos de dos aviones:");
        
        scanner.close();
    }

	public static Piloto getPilotoUsuario1() {
		return pilotoUsuario1;
	}

	public static void setPilotoUsuario1(Piloto pilotoUsuario1) {
		Gestion.pilotoUsuario1 = pilotoUsuario1;
	}
}
