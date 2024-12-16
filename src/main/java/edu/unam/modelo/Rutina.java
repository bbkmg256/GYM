
// Clase rutina

/*

Establece las rutinas que se crean a partir de los ejercicios, con
sus series y repeticiones, asignadas al entrenamiento que recibe
el cliente.

*/

package edu.unam.modelo;

/**
 *
 * @author bbkmg
 */
public class Rutina {
	// Atributo
	private int idRutina;
	private int cantSeries;
	private int cantRepeticiones;
	// atributo relacion a clase Ejercicio
	// atributo relacion a clase Entrenamiento
	
	// Constructor
	Rutina(int paramIdRutina, int paramCantSeries, int paramCantRepet){
		this.idRutina = paramIdRutina;
		this.cantSeries = paramCantSeries;
		this.cantRepeticiones = paramCantRepet;
	}
	
	// Set
	public void setIdRutina(int valIdRutina){
		this.idRutina = valIdRutina;
	}
	
	public void setCantSeries(int valCantSeries){
		this.cantSeries = valCantSeries;
	}
	
	public void setCantRepeticiones(int valCantRepet){
		this.cantRepeticiones = valCantRepet;
	}
	
	// Get
	public int getIdRutina(){
		return this.idRutina;
	}
	
	public int getCantSeries(){
		return this.cantSeries;
	}
	
	public int getCantRepeticiones(){
		return this.cantRepeticiones;
	}
	
	// Metodos
}
