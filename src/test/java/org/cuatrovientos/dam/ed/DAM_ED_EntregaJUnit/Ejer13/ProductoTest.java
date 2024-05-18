package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * CLASEProductoTest PRUEVA TODOS LOS METODOS DE LA CLASE FACTURA CREANDO UN
 * PRODUCTO PARA COMPROBAR TODOS LOS TEST
 */

class ProductoTest {
	Producto product = new Producto("Galleta", 0.99f, 2);

	/**
	 * VERIFICA QUE EL NOMBRE DEL PRODUCTO YA CREADO ES CORRECTO
	 */
	@Test
	void testNombre() {
		String expectedNombre = "Galleta";
		String actualNombre = product.getNombre();
		assertEquals(expectedNombre, actualNombre);
	}

	/**
	 * VERIFICA QUE EL PRECIO DEL PRODUCTO YA CREADO ES CORRECTO
	 */
	@Test
	void testPrecio() {
		int expected = 1;
		float expected0 = 0;
		float expectCorrecto = 0.99f;
		float actual = product.getPrecio();
		assertEquals(expected, actual, "El precio introducido debe de ser de tipo float");
		assertEquals(expected0, actual, "El precio debe de ser > 0");
		assertEquals(expectCorrecto, actual);
	}

	/**
	 * VERIFICA QUE LA CANTIDAD DEL PRODUCTO YA CREADO ES CORRECTO
	 */
	@Test
	void testCantidad() {
		int expected = -3;
		int expected0 = 0;
		int actual = product.getCantidad();
		assertEquals(expected, actual, "La cantidad del producto debe de ser >0 ");
		assertEquals(expected0, actual, "La cantidad no puede ser 0");
	}

	/**
	 * VERIFICA QUE EL CALCULO DEL PRECIO TOTAL ES CORRECTO, EN CASO CONTRARIO SALTA UN MENSAJE AVISANDO DEL ERROR 
	 */
	@Test
	void testPrecioTotal() {
		float expectedIncorrecta = 2f;
		float expectedCorrecta = 1.98f;
		float actual = product.precioTotal();
		assertEquals(expectedIncorrecta, actual, "Calculo del precio total incorrecta");
		assertEquals(expectedCorrecta, actual);

	}
	/**
	 * VERIFICA QUE EL TOSTRING DEL PRODUCTO DEVUELVE LA INFORMACIÓN CORRECTA 
	 */
	@Test
	public void testToString() {
		String expectedStr = "Producto \n====================== \nNombre = Galleta \nPrecio = 0.99f \nCantidad = 2";
		assertEquals(expectedStr, product.toString());
	}
	/**
	 * COMPRUEBA QUE LOS SETTERS DE LAS PRODIEDADES DEL PRODUCTO SE INTRODUCEN/ACTUALIZAN CORRECTAMENTE 
	 */
	@Test
	public void testSetNombre() {
		product.setNombre("Leche");
		String expectedNombre = "Leche";
		assertEquals(expectedNombre, product.getNombre());
	}

	@Test
	public void testSetPrecio() {
		product.setPrecio(1.20f);
		float expectedPrecio = 1.20f;
		assertEquals(expectedPrecio, product.getPrecio());
	}

	@Test
	public void testSetCantidad() {
		product.setCantidad(3);
		int expectedCant = 3;
		assertEquals(expectedCant, product.getCantidad());
	}
}
