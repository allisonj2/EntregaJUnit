package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;
/**
 * CLASE PAQUETE CON LOS ATRIBUTOS (DESTINO Y PESO)
 */
public class Paquete {
	private String destino; 
	private float peso;
	/**
	 * CONSTRUCTO DE PAQUETE 
	 * @param destino DESTINO FINAL DEL PAQUETE 
	 * @param peso PESO DEL PAQUETE 
	 */
	public Paquete(String destino, float peso) {
		super();
		this.destino = destino;
		this.peso = peso;
	}
	/**
	 * GETTERS Y SETTERS DE PAQUETE: 
	 * GETTERS: SOLICITA LA PROPIEDAD INDICADA (DESTINO O PESO)
	 * @return ESTOS DEVUELVE LA PRODIEDAD 
	 * SETTERS: ACTUALIZA ALGUNA PROPIEDAD 
	 */
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	/**
	 * INDICA TODA LA INFORMACIÓN DEL PAQUETE
	 */
	@Override
	public String toString() {
		return "Paquete \n====================== \nDestino = " + destino + "\nPeso = " + peso;
	} 
}
