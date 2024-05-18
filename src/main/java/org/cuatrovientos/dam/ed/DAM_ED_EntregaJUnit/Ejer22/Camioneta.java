package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import java.util.ArrayList;
import java.util.Random;
/**
 * CLASE Camioneta IMPLEMENTA LA INTERFAZ TRANSPORTE 
 * UTILIZA UN ARRAYLIST DE PAQUETES 
 */
public class Camioneta implements Transporte{

	 ArrayList <Paquete> paquetes = new ArrayList<Paquete>(); 
	 /**
	  *AÑADE UN PAQUETE NUEVA A LA CAMIONETA
	  *@param PAQUETE QUE SE DESEA AÑADIR
	  */
	@Override
	public void incluirPaquete(Paquete paquete) {
		paquetes.add(paquete); 
	}
	/**
	 * CALCULA EN PESO TOAL DE TODOS LOS PAQUETES QUE TIENE EL CAMIÓN
	 * @return PESO TOTAL DE CARGA EL CAMIÓN
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
	 * CREA UNA DISTANCIA ALEATORIA ENTRE 70 Y 100, DISTANCIA QIUE LA CAMIONETA TENDRA QUE RECORRER
	 * @return DISTANCIA QUE RECORRERA EL CAMIÓN 
	 */
	@Override
	public int recorrerDistancia() {
		Random miRan = new Random();
		return miRan.nextInt(69, 101); 
	}

}
