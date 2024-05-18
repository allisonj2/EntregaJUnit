package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

/**
 * CLASE PRODUCTO: PRODUCTO CON UN NOMBRE, UN PRECIO Y CANTIDAD DEL PRODUCTO
 */
public class Producto {
	protected String nombre;
	protected float precio;
	protected int cantidad;

	/**
	 * CONSTRUCTOR DE UN PRODUCTO CON LOS PARAMETROS:
	 * 
	 * @param nombre   EL NOMBRE DEL PRODUCTO
	 * @param precio   PRECIO DEL PRODUCTO
	 * @param cantidad Y FINALMENTE LA CANTIDAD, UNIDADES DEL PRODUCTO
	 */
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	/**
	 * MÉTODO QUE CALCULA EN PRECIO TOTAL DEL PRODUCTO, ESTE SE OBTIENE
	 * MULTIPLICANDO EL PRECIO POR LAS UNIDADES
	 * 
	 * @return PRECIO TOTAL DEL PRODUCTO
	 */
	public float precioTotal() {
		return precio * cantidad;
	}

	/**
	 * TOSTRING INDICA TODA LA INFORMACIÓN DEL PRODUCTO
	 */
	@Override
	public String toString() {
		return "Producto \n====================== \nNombre = " + nombre + "\nPrecio = " + precio + "\nCantidad = "
				+ cantidad;
	}
	/**
	 * GETTERS Y SETTERS DE LAS PROPIEDAD: 
	 * GETTERS: PIDE ALGUN PROPIEDAD (NOMBRE, PRECIO O CANTIDAD)
	 * @return REVUELVE LA PROPIEDAD SOLICITADA
	 * SETTERS: CAMBIA ALGUNA PROPIEDAD 
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
