package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	/**
	 * LA CLASE GeneradorIpTest:
	 *  PRUEVA TODOS LOS METODOS DE LA CLASE GeneradorIp
	 */
	private GeneradorIp generadorIp = new GeneradorIp();
	/**
	 * EL MÉTODO testGenerarNumero COMPRUEBA QUE EL NÚMERO ALEATORIO GENERADO ESTE DENTRO DEL RANGO PERMINTIDO 
	 */

	@RepeatedTest(1000)
	void testGenerarNumero() {
		int numero = generadorIp.generarNumero(0, 254); 
		assertTrue(numero >= 0 && numero <= 254, "El número: "+ numero + "Se encuentra fuera del rango" );
	}
	/**
	 * LA CLASE testGenerarIp VERIFICA QUE LA IP GENERADA NO TERMINE NI EMPIECE POR CERO
	 */
	@Test
	void testGenerarIp() {
		String ip = generadorIp.generarIp(); 
		String[] numSepadaros = ip.split("\\.");
        int primNum = Integer.parseInt(numSepadaros[0]);
        int ultNum = Integer.parseInt(numSepadaros[3]);
        assertTrue(primNum != 0, "El primer número de la IP es 0");
        assertTrue(ultNum != 0, "El último número de la IP es 0");
		
	}
}
