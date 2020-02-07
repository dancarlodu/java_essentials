package src1.Soluciontareas;

import libs.Input;

public class iniciales_dificil {

	public static void main(String[] args) {
	
		// Ejercicio de Iniciales Dificiles
		
		
		//Solicitar nombre de la persona
		Input.print("Ingrese nu nombre completo: ");
		String nombre_persona = Input.get_string();
		
		
		String[] palabras = nombre_persona.split(" ");
	
	
			//Contador de las palabras del nombre completo
			 
		
			for (int i = 0, n = palabras.length; i < n; i++) {
				 
				 palabras[i] =  palabras[i].trim();			 
				 			 	 
				 	if(palabras[i].equals("") !=true ) {		 		
		               
				 		
				 			if (palabras[i].charAt(0) >= 'a' && palabras[i].charAt(0) <= 'z')
				            {
				                Input.print((char) (palabras[i].charAt(0) - ('a' - 'A')));
				            }
				            else
				            {
				                Input.print(palabras[i].charAt(0));    
				            }
				 	}			 				

	
		        }

		}


}