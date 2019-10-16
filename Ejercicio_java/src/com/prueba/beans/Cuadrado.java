package com.prueba.beans;

import com.prueba.interfaces.IFiguraGeometrica;

/**
 * Clase Cuadrado que hereda de FiguraGeometrica e implementa una interfaz
 * @author Samuel
 *
 */
public class Cuadrado extends FiguraGeometrica implements IFiguraGeometrica {

	private double lado;

	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	/**
	 * Sobreescribimos el metodo calculateArea
	 */
	@Override
	public double calculateArea() {		
		super.area = lado * lado;
		return super.area;
	}

	/**
	 * Sobreescribimos el metodo setDimensions
	 */
	@Override
	public void setDimensions(double x, double y) {
		if(x < 0 || y < 0) {
			if(x == y) {
				this.lado = x;
			} else {
				System.out.println("La figura cuadrado tiene los lados iguales, las dimensiones no son correctas.");
			}
		} else {
			System.out.println("Las longitudes no pueden ser negativas.");
		}	
		
	}

}
