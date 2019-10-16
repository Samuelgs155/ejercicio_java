package com.prueba.beans;

import com.prueba.interfaces.IFiguraGeometrica;

/**
 * Clase Rectangulo que hereda de FiguraGeometrica e implementa una interfaz
 * @author Samuel
 *
 */
public class Rectangulo extends FiguraGeometrica implements IFiguraGeometrica {

	private double alto;
	private double ancho;

	public Rectangulo() {
		super();
	}

	public Rectangulo(double alto, double ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Rectangulo [alto=" + alto + ", ancho=" + ancho + "]";
	}

	/**
	 * Sobreescribimos el metodo calculateArea
	 */
	@Override
	public double calculateArea() {
		super.area = alto * ancho;
		return 0;
	}

	/**
	 * Sobreescribimos el metodo setDimensions
	 */
	@Override
	public void setDimensions(double x, double y) {
		if(x < 0 || y < 0) {
			this.ancho = x;
			this.alto = y;
		} else {
			System.out.println("Las longitudes no pueden ser negativas.");
		}	
		
	}

}
