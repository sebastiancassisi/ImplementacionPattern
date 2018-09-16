package pattern;

import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) {
	
		String patron = ";";
		
		Pattern p = Pattern.compile(patron);
		
		String [] arreglo = p.split("Hola;a;todos;mis;amigos");
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
	}

}
