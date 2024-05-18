package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer12;

import java.util.Random;

public class GeneradorIp {
	/**
	 * LA CLASE GeneradorIp GENERA NÚMEROS ALEATORIOS LOS CUALES SE UTILIZAN PARA
	 * GENERAR IPS ALEATORIAS
	 */
	Random miRan = new Random();

	/**
	 * DECLARAMOS UN RANDOM (miRan)
	 * 
	 * @param min VALOR MINIMO QUE PUEDE ADQUIRIR EL NÚMERO GENERADO
	 * @param max VALOR MAXIMO QUE PUEDE ADQUIRIR EL NÚMERO GENERADO
	 * @return VALOR ALEATORIO ENTRE LOS RANGOS INTRODUCIDOS (MIN Y MAX)
	 */
	public int generarNumero(int min, int max) {
		return miRan.nextInt(min, max);
	}

	/**
	 * GENERA UN IP CON LOS NÚMEROS ALEATORIOS, ESTA IP NO COMIENZA NI TERMINA POR 0
	 * CUANDO SE AÑADE UN NÚMERO ALEATORIO AL STRING DE LA IP SE AÑADE UN (.) EXCEPTO EN EL ULTIMO 
	 * @return  DEVUELVE UNA DIRECCIÓN IP ALEATORIA CON LAS CARACTERISTICAS MENCIONADAS 
	 */
	public String generarIp() {
		String ipNew = "";
		for (int i = 0; i < 4; i++) {
			if (i == 0 || i == 3) {
				int num = generarNumero(1, 254);
				if (i == 3) {
					ipNew += num;
				}
				ipNew += num + ".";
			}
			int num = generarNumero(0, 254);
			ipNew += num + ".";
		}
		return ipNew;
	}
}
