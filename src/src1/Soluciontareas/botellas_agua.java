package src1.Soluciontareas;

import libs.Input;

public class botellas_agua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutos;
		
		Input.print("Minutos:  ");
		minutos = Input.get_int();
		
		//Agregar funci�n que force ingresar un n�mero positivo
		
		System.out.println("Botellas: "+minutos*12);	

	}

}
