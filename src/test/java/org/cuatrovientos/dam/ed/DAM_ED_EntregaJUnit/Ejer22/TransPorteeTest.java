package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * CLASE TransPorteeTest QUE PRUEBA LOS METODOS DE LA CLASE CAMIONETA 
 */
class TransPorteeTest {
	@Test
	/**
	 * VERIFICA EL MÉTODO DE LA CLASE CAMIONETA
	 * AÑADE UN PAQUETE CREADO A UNA CAMIONETA, Y ESTE VERIFICA QUE EL CALCULO DEL PESO TOTAL ES CORRECTO 
	 */
	void testPesoTotal() {
		Camioneta miCamioneta = new Camioneta();
		Paquete paquete = new Paquete("Valencia", 11f);
		miCamioneta.incluirPaquete(paquete);
		assertEquals(11f, miCamioneta.pesoTotal());
	}
	@Test
	/**
	 * SE CREA UNA CAMIONETA
	 * SE GENERA UNA DISTANCIA ALEATORIA ENTRE LOS VALORES 70 Y 100
	 * ESTE MÉTODO VERIFICA QUE LA DISTANCIA GENERADA ENTA DENTRO DEL RANGO PERMITIDO 
	 */
	void testRecorrerDistancia() {
		Camioneta miCamioneta = new Camioneta();
		int distancia = miCamioneta.recorrerDistancia();

		assertTrue(distancia >= 70 && distancia <= 100); 
	}
}
