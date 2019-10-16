package com.prueba.interfaces;

import com.prueba.beans.FiguraGeometrica;

/**
 * 
 * @author Samuel
 *
 */
public interface IConsumidor {

	public void sendFigure(FiguraGeometrica fg);
	public double getTotalArea();
}
