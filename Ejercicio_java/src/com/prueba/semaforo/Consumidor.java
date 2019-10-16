package com.prueba.semaforo;

import com.prueba.beans.FiguraGeometrica;
import com.prueba.interfaces.IConsumidor;

/**
 * 
 * @author Samuel
 *
 */
public class Consumidor implements Runnable, IConsumidor {
	private final Contenedor contenedor;
	private final int idconsumidor;

	/**
	 * Constructor de la clase
	 * 
	 * @param contenedor   Contenedor común a los consumidores y el productor
	 * @param idconsumidor Identificador del consumidor
	 */
	public Consumidor(Contenedor contenedor, int idconsumidor) {
		this.contenedor = contenedor;
		this.idconsumidor = idconsumidor;
	}

	@Override
	/**
	 * Implementación de la hebra
	 */
	public void run() {
		while (Boolean.TRUE) {
			System.out.println("El consumidor " + idconsumidor + " consume: " + contenedor.get());

		}
	}

	@Override
	public void sendFigure(FiguraGeometrica fg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTotalArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
