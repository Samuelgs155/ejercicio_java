package com.prueba.factory;

import com.prueba.beans.Circulo;
import com.prueba.beans.Cuadrado;
import com.prueba.beans.FiguraGeometrica;
import com.prueba.beans.Rectangulo;

/**
 * 
 * @author Samuel
 *
 */
public class FiguraGeometricaFactory {

	/**
	 * Este metodo genera una figura acorde al numero aleatorio
	 * @return un objeto
	 */
	public static FiguraGeometrica generarFigura() {
		FiguraGeometrica fg = null;
		int numero = (int) (Math.random() * 3) + 1;
		if (numero == 1) {
			fg = new Circulo(1);
		} else if (numero == 2) {
			fg = new Cuadrado(1);
		} else if (numero == 3) {
			fg = new Rectangulo(1, 1);
		}
		return fg;
	}
}
