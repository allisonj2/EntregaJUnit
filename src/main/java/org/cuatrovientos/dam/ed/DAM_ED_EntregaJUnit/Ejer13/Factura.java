package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * LA CLASE Factura REPRESENTA UNA FACTURA QUE TIENE DIVERSOS PRODUCTOS
 */
class Factura{
	
	ArrayList <Producto> productos ; 
	/**
	 * CONTIENE UN CONSTRUCTOR EN LA QUE SE INICIALIZA UN ARRAYLIST DE PRODUCTOS
	 */
	
	public Factura() {
		this.productos = new ArrayList <>();
	}
/**
 * MÉTODO meterproducto AÑADE UN NUEVO PRODUCTO A LA FACTURA 
 * @param newProd PRODUCTO QUE DESEA AÑADIR 
 */
	public void meterproducto(Producto newProd) {
		productos.add(newProd); 
	}
	/**
	 * MÉTODO QUE CALCULA EL TOTAL DE LA FACTURA, ESTA SE OBTIENE SUMANDO LOS PRECIOS
	 * DE TODOS LOS PRODUCTOS 
	 * @return TOTAL DE LA FACTURA OBTENIDA
	 */
	public float totalFactura() {
		float total = 0; 
		for (int i = 0; i < productos.size(); i++) {
			total += productos.get(i).precio;
		}
		return total; 
	}
	/**
	 * CALCULA EL PRECIO TOTAL DE LA FACTURA MÁS EL IVA QUE SE LE APLICA 
	 * @param iva PORCENTAJE DE IVA QUE SE DESEA APLICAR AL TOTAL 
	 * @return PRECIO TOTAL  CON EL IVA 
	 */
	public float AplicarIVA(float iva) {
		float precioFin = totalFactura(); 
		return (precioFin * iva)/100 + precioFin; 
	}
	
}
