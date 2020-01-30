package src1.Soluciontareas;

//import libs.Input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minimo_monedas {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int acum_monedas;
		float residuo;
		float cambio;		

		
		System.out.print("Digite el Cambio en Fracción: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		cambio = Float.parseFloat(reader.readLine());
		
		
		acum_monedas = (int) (cambio / 0.25);
		residuo = (float) (cambio % 0.25);
		residuo= (float) (Math.round(residuo * 100) / 100d);
		
		acum_monedas = (int) (acum_monedas + (residuo / 0.10));
		residuo = (float) (residuo % 0.10);
		residuo= (float) (Math.round(residuo * 100) / 100d);
		
		acum_monedas = (int) (acum_monedas + (residuo / 0.05));
		residuo = (float) (residuo % 0.05);
		residuo= (float) (Math.round(residuo * 100) / 100d);
		
		acum_monedas = (int) (acum_monedas + (residuo / 0.01));
		residuo = (float) (residuo % 0.01);
		residuo= (float) (Math.round(residuo * 100) / 100d);		
		

		System.out.println("El número mínimo de monedas es: "+acum_monedas);
		
	}

}
