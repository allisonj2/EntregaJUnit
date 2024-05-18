package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * CLASE FacturaTest PRUEVA TODOS LOS METODOS DE LA CLASE FACTURA 
 */
class FacturaTest {
	/** 
	 * MÉTODO QUE VERIFICA SI EL CALCULO DEL TOTAL DE LA FACTURA ES CORRECTO
	 *  PRIMERO: CREACION DE UNAA FACTURA, EN LA QUE SE AÑADE DIVERSOS PRODUCTOS
	 */
	@Test
	void testTotalFactura() {
		 
		Factura factura = new Factura();
		factura.meterproducto(new Producto("Pan", 0.5f, 3));
		factura.meterproducto(new Producto("Zumo", 1.25f, 1));
		factura.meterproducto(new Producto("Patata", 4.2f, 1));
		assertEquals(5.95, factura.totalFactura()); 
	}
	/**
	 * MÉTODO QUE VERIFICA SI EL CALCULO DEL TOTAL DE LA FACTURA APLICANDO EL IVA INTRODUCIODO ES CORRECTO
	 * CREACION DE UNA FACTURA, EN LA QUE SE AÑADE DOS PRODUCTOS
	 */
	@Test
	void testAplicarIVA() {
		Factura factura = new Factura();
		factura.meterproducto(new Producto("Pan", 0.5f, 3));
		factura.meterproducto(new Producto("Patata", 4.2f, 1));
		assertEquals(3.76, factura.AplicarIVA(20)); 
	}
}
