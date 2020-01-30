package src1.Soluciontareas;

import libs.Input;

public class mario_dificil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int altura;
		int temp_altura;
		int temp;
				
		Input.print("Altura:  ");
		altura = Input.get_int();
		temp_altura = altura;
		
		
		for(int linea = 0; linea < altura ; linea += 1) {
			
			temp = 1;
			
			//Piramide hacia abajo
			for(int num2 = 0; num2 < altura ; num2 += 1) {
				
				if (temp_altura > temp) {
				Input.print(" ");
			}
				else {
					Input.print("#");
				}
				temp +=1;		
			}
			
			Input.print(" -- ");
			
			//Piramide hacia arriba
			for(int linea2 = 0; linea2 < altura ; linea2 += 1) {
				
				if (temp_altura >= temp) {
				Input.print(" ");
			}
				else {
					Input.print("#");
				}
				temp -=1;		
			}
			
			System.out.println("");
			temp_altura -=1;
		}
	}

}


