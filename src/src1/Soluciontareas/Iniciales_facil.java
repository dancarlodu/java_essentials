package src1.Soluciontareas;

import libs.Input;

public class Iniciales_facil {

	public static void main(String[] args) {
		// Ejercicio de Iniciales Faciles
		
		
		//Solicitar nombre de la persona
		Input.print("Ingrese nu nombre completo: ");
		String nombre_persona = Input.get_string();
		
		//Validar que el nombre de la personal no sea null
		if (nombre_persona != null)
	    {
			Input.print("Metodo 1: \n");
	        for (int i = 0, n = nombre_persona.length(); i < n; i++)
	        {
	            if (nombre_persona.charAt(i) >= 'A' && nombre_persona.charAt(i) <= 'Z')
	            {
	              
	                Input.print(nombre_persona.charAt(i));
	            }
	        }
	        Input.print("\n");
	    }
		
		Input.print("Metodo 2: \n");
		Input.print(nombre_persona.split(" "));	
		String[] palabras = nombre_persona.split(" ");
		
		for (int i = 0, n = palabras.length; i < n; i++)        {
            
                      
                Input.print(palabras[i].charAt(0));
            
        }
		
        Input.print("\n");
    }

	}


