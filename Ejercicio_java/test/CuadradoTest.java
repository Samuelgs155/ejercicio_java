import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.prueba.beans.Cuadrado;

/**
 * Pruebas unitarias
 * @author Samuel
 *
 */
class CuadradoTest {
	
	@Test
	public void testIncrementa()
	{
	   Cuadrado cuadrado = new Cuadrado();
	   assertEquals("El área del cuadrado debe ser 0.0. ", 0.0, 0.0, 1e-6);
	}

}
