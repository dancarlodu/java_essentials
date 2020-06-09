package src1.tareas;

import libs.Input;

public class Isoceles {

	public static void main(String[] args) {
		
		System.out.print("Altura del Tringulo:");
		int altura = Input.get_int(); // pedir al usuario la altura del triangulo
		
		
		for (int num = 0; num < altura; num +=1) {
			
			//System.out.println("*");
			int num_asteriscos = 2*num+1;
			
			int num_asteriscos_base = 2*altura-1;
			
			int num_espacios = (num_asteriscos_base - num_asteriscos)/2;
			
			for(int i=0; i < num_espacios; i +=1) {
				
				System.out.print(" ");
			}
					
						
			for(int i=0; i < num_asteriscos; i +=1) {
				
				System.out.print("#");
			}
					
			System.out.println();
		}
		//dibujar linea por linea

	}

}
