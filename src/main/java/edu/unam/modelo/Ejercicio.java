
// Clase ejercicio

/*

Comprende a los ejercicio que trabaja un grupo muscular y que conformará
la rutina que se le asigna al cliente.

*/

package edu.unam.modelo;

/**
 *
 * @author bbkmg
 */
public class Ejercicio {
	// Atributo
	private int idEjercicio;
	private String nombreEjercicio;
	// atributo relacion con clase GM
	// atributo relacion con clase Rutina
	
	// Constructor
	Ejercicio(int paramIdEjer, String paramNombreEjer){
		this.idEjercicio = paramIdEjer;
		this.nombreEjercicio = paramNombreEjer;
	}
	
	// Set
	public void setIdEjercicio(int valIdEjer){
		this.idEjercicio = valIdEjer;
	}
	
	public void setNombreEjercicio(String valNombreEjer){
		this.nombreEjercicio = valNombreEjer;
	}
	
	// Get
	public int getIdEjercicio(){
		return this.idEjercicio;
	}
	
	public String getNombreEjercicio(){
		return this.nombreEjercicio;
	}
	
	// Metodos
}
