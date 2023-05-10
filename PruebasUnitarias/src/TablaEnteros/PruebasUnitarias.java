package TablaEnteros;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.*;

class PruebasUnitarias {
	
	static TablaEnteros objeto;
	
	@BeforeAll
	public static void inicializar() {
		Integer[] numeros = new Integer[5];
		objeto = new TablaEnteros(numeros);
		numeros[0] = 2;
		numeros[1] = 4;
		numeros[2] = 6;
		numeros[3] = 8;
		numeros[4] = 10;
	}
	
	@Test
	void testSumaTabla() {
		assertEquals(30, objeto.sumaTabla());
	}
	
	@Test
	void testMayorTabla() {
		assertEquals(10, objeto.mayorTabla());
	}
	
	@Test
	void testPosicionTabla() {
		assertEquals(4, objeto.posicionTabla(10));
	}

}
