package Calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testCalculadora() {
		// fail("Not yet implemented");
	}

	@Test
	void testSuma() {
		Calculadora c = new Calculadora(4, 5);
		int resultado = c.suma();
		assertEquals(9, resultado);
		// fail("Not yet implemented");
	}

	@Test
	void testResta() {
		Calculadora c = new Calculadora(10, 5);
		int resultado = c.resta();
		assertEquals(5, resultado);
		// fail("Not yet implemented");
	}

	@Test
	void testProducto() {
		Calculadora c = new Calculadora(4, 5);
		int resultado = c.producto();
		assertEquals(20, resultado);
		// fail("Not yet implemented");
	}

	@Test
	void testDivision() {
		Calculadora c = new Calculadora(10, 2);
		double resultado = c.division();
		assertEquals(5, resultado);
		// fail("Not yet implemented");
	}

}
