package examen;

import java.util.Arrays;
import java.util.Random;

//import modelo.Libro;

public class Metodos {

	// ejercicio 1

	// ejercicio 2
	
	// ejercicio 3
	
	public int[][] metodo3(int jugadores,int partidas){
		Random rnd = new Random();
		int[][] resultado= new int [jugadores][partidas];
		for (int i = 0; i < jugadores; i++) {
			for (int j = 1; j < partidas; j++) {
				resultado[i][0] = i;
				resultado[i][j] = 1 + rnd.nextInt(6);
			}
		}
		return resultado;
	}
}
