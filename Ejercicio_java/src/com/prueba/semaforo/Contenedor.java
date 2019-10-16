package com.prueba.semaforo;

import com.prueba.beans.Circulo;
import com.prueba.beans.Cuadrado;
import com.prueba.beans.FiguraGeometrica;

/**
 * 
 * @author Samuel
 *
 */
public class Contenedor 
{
    private FiguraGeometrica contenido;
    private boolean contenedorlleno = Boolean.FALSE;
 
    /**
     * Obtiene de forma concurrente o síncrona el elemento que hay en el contenedor
     * @return Contenido el contenedor
     */
    public synchronized FiguraGeometrica get()
    {
        while (!contenedorlleno)
        {
            try
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Contenedor: Error en get -> " + e.getMessage());
            }
        }
        // En esta parte hay que actualizar el area de la FiguraGeometrica
        
        contenedorlleno = Boolean.FALSE;
        notify();
        
        if(contenido instanceof Cuadrado || contenido instanceof Circulo) {
        	return contenido;
        } else {
        	return null;
        }        
        
    }
 
    /**
     * Introduce de forma concurrente o síncrona un elemento en el contenedor
     * @param value Elemento a introducir en el contenedor
     */
    public synchronized void put(FiguraGeometrica value) 
    {
        while (contenedorlleno) 
        {
            try
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Contenedor: Error en put -> " + e.getMessage());
            }
        }
        contenido = value;
        contenedorlleno = Boolean.TRUE;
        notify();
    }
}
