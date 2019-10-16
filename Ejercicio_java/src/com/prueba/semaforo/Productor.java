package com.prueba.semaforo;

import java.util.Random;

import com.prueba.beans.FiguraGeometrica;
import com.prueba.factory.FiguraGeometricaFactory;
import com.prueba.interfaces.IProductor;

/**
 * 
 * @author Samuel
 *
 */
public class Productor implements Runnable, IProductor {	
	
	private final Contenedor contenedor;
	private final int idproductor;
	private long tiempoEspera = 1000;
	private long numFiguras = 1;
	private int contador = 1;

	/**
	 * Constructor de la clase
	 * 
	 * @param contenedor  Contenedor común a los consumidores y el productor
	 * @param idproductor Identificador del productor
	 */
	public Productor(Contenedor contenedor, int idproductor) {
		this.contenedor = contenedor;
		this.idproductor = idproductor;
	}

	@Override
	/**
	 * Implementación de la hebra
	 */
	public void run() {
		while (Boolean.TRUE && (numFiguras >= contador)) {			
			FiguraGeometrica fg = FiguraGeometricaFactory.generarFigura();
			contenedor.put(fg);
			System.out.println("El productor " + idproductor + " pone: " + fg.toString());
			contador++;
			try {
				Thread.sleep(tiempoEspera);
			} catch (InterruptedException e) {
				System.err.println("Productor " + idproductor + ": Error en run -> " + e.getMessage());
			}
		}
	}

	@Override
	public void setFrequency(long seconds) {
		this.tiempoEspera = seconds;
	}

	@Override
	public void setNumberOfFigures(long n) {
		if (n < 101 && n > 0) {
			this.numFiguras = n;
		} else {
			System.out.println("Solo se va a generar una sola figura.");
		}

	}
}
