package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import java.util.ArrayList;
import java.util.Random;

/**
 * CLASE TRAINER: IMPLEMENTA LA CLASE TRANSPORTE AARAYLIST PARA ALMACENAR TODOS
 * LOS PAQUETES DE ESE TRAILER CREACIÓN DE UN RANDOM
 */
public class Trailer implements Transporte {

	ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
	Random miRan = new Random();

	/**
	 * CONSTRUCTOR DE TRAILER
	 * 
	 * @param paquetes LISTA DE PAQUETES
	 */

	public Trailer(ArrayList<Paquete> paquetes) {
		this.paquetes = paquetes;
	}

	/**
	 * AÑADE UN PAQUETE AL TRAILER
	 * 
	 * @param paquete PAQUETE QUE SE DESEA AÑADIR
	 */
	@Override
	public void incluirPaquete(Paquete paquete) {
		paquetes.add(paquete);
	}

	/**
	 * MÉTODO QUE CALCULA EL PESO TOTAL DE TODOS LOS PAQUETES QUE CARGA EL TRAILER
	 *@return PESO TORTAL DE LOS PAQUETES QUE HAY EN EL TRAILER 
	 */

	@Override
	public float pesoTotal() {
		float pesoTotal = 0;
		for (int i = 0; i < paquetes.size(); i++) {
			pesoTotal += paquetes.get(i).getPeso();
		}
		return pesoTotal;
	}

	/**
	  * GENRERA UNA DISTANCIA ALEATORIA QUE DEBE DE RECORRER EL TRAILER 
	  * @return DISTANCIA RECORRIDA 
	  */

	@Override
	public int recorrerDistancia() {
		return miRan.nextInt(269, 301);
	}

}
