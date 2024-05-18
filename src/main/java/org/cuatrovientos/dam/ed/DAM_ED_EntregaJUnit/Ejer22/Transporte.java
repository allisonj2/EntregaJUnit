package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;
/*+
 * INTERFAZ 
 * DEFINE LOS MÉTODOS QUE LAS CLASES QUE QUIERAN LA DEBEN INCLUIRLAS 
 */
public interface Transporte {
	/**
	 * MÉTODO PARA AÑADIR UN PAQUETE EN EL TRANSPORTE 
	 * @param paquete PAQUETE QUE SE DESEEA AÑADIR 
	 */
	public void incluirPaquete(Paquete paquete); 
	/**
	 * CALCULO DE PESO TOTAL
	 * @return  PESO TOTAL DEL TRANSPORTE 
	 */
	public float pesoTotal(); 
	/**
	 * DISTANCIA QUE RECORRE 
	 * @return DISTANCIA QUE RECOORE EL TRANSPORTE 
	 */
	public int recorrerDistancia(); 
}
