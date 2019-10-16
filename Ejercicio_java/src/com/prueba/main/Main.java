package com.prueba.main;

import com.prueba.beans.Cuadrado;
import com.prueba.semaforo.Consumidor;
import com.prueba.semaforo.Contenedor;
import com.prueba.semaforo.Productor;

/**
 * Clase principal que se ejecuta
 * @author Samuel
 *
 */
public class Main {
	
	private static Contenedor contenedor;
    private static Thread productor;
    private static Thread [] consumidores;
    private static final int CANTIDADCONSUMIDORES = 5;

	public static void main(String[] args) {

		System.out.println("Inicio del ejercicio.");
		
		contenedor = new Contenedor();
        productor = new Thread(new Productor(contenedor, 1));
        consumidores = new Thread[CANTIDADCONSUMIDORES];
 
        consumidores[0] = new Thread(new Consumidor(contenedor, 1));
        consumidores[0].start();
        /*
        Esta parte se utilizara si aumentamos el numero de consumidores
        for(int i = 0; i < CANTIDADCONSUMIDORES; i++)
        {
            consumidores[i] = new Thread(new Consumidor(contenedor, i));
            consumidores[i].start();
        }*/
         
        productor.start();
		
	}

}
