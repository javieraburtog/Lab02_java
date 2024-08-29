package package1;

import java.util.Scanner;

public class eescobar {

	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar los apellidos del usuario
        System.out.print("Introduce tus apellidos: ");
        String apellidos = scanner.nextLine();

        // Imprimir el nombre completo en la consola
        System.out.println("Nombre completo: " + nombre + " " + apellidos);

        // Cerrar el scanner
        scanner.close();
    }
	
}
