
// Clase rutina

/*

Establece las rutinas que se crean a partir de los ejercicios, con
sus series y repeticiones, asignadas al entrenamiento que recibe
el cliente.

*/

// Paquete
package edu.unam.modelo;

// Libs
import java.util.ArrayList;

import javax.persistence.Basic; // Modulo JPA para atributos basicos
import javax.persistence.Entity; // Modulo JPA para entidades/objetos

// Modulos JPA para generacion de ID, valores de generación de ID y forma de generación de ID
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author bbkmg
 */
@Entity
public class Rutina {
	// Atributo
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idRutina;
	
	@Basic
	private int cantSeries;
	private int cantRepeticiones;
	
	// atributo relacion a clase Ejercicio (Lista)
	// private ArrayList<Ejercicio> ejercicios = new ArrayList<>();
	
	// atributo relacion a clase Entrenamiento (Lista)
	// private ArrayList<Entrenamiento> entrenamientos = new ArrayList<>();
	
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
