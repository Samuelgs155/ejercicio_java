package com.prueba.beans;

import com.prueba.interfaces.IFiguraGeometricaCircular;

/**
 * Clase Circulo que hereda de FiguraGeometrica e implementa una interfaz
 * @author Samuel
 *
 */
public class Circulo extends FiguraGeometrica implements IFiguraGeometricaCircular {

	private double radio;

	public Circulo() {
		super();
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	/**
	 * Sobreescribimos el metodo calculateArea
	 */
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	/**
	 * Sobreescribimos el metodo setDimensions
	 */
	@Override
	public void setDimensions(double radius) {
		this.radio = radius;
	}

}
