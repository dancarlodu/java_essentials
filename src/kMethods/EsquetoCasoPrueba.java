package kMethods;

public class EsquetoCasoPrueba {

	public static void main(String[] args) {
		// Metodo para el caso de prueba de la página Songs Sinatra

		//		login (usario, contrasena);
		//		crearCancion (titulo, duracion, fecha_creacion, letra);
		//		borrarCancion (titulo, indice);


		login ("frank", "sinatra");
		crearCancion ("Guillermo Tell", 15, "01/01/1820", "mmmmmmmm");
		borrarCancion ("Guillermo Tell", 1);
		consultarCancion("Guillermo Tell");
		


	}

	private static void consultarCancion(String titulo) {
		// TODO Auto-generated method stub
		
	}

	private static void borrarCancion(String titulo, int indice) {
		// TODO Auto-generated method stub

	}

	private static void crearCancion(String titulo, int duracion, String fecha_creacion, String letra) {
		// TODO Auto-generated method stub

	}

	private static void login(String usario, String contrasena) {
		// Navegar a la página de songs by sinatra
		
		// Dar clic en la URL de login
		
		// Esperar a que aparezca los campos de usuario y password
		
		// Ingresar lo que venga en la variable usario en el campo username

	}

}
