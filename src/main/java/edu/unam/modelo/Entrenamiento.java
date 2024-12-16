
// Clase entrenamiento

/*

Basicamente esta clase se el entrenamiento en si que imparte el tutor al
cliente, acá tambien se supone que el cliente al finalizar las 5 semanas
puntua el servicio del tutor.

*/

package edu.unam.modelo;

import java.util.Date;

/**
 *
 * @author bbkmg
 */
public class Entrenamiento {
	// Atributos
	private int idEntrenamiento;
	private int puntaje; // Puntuación por parte del cliente al tutor.
	private Date fechaInicio;
	private Date fechaFin;
	
	// Volumen de entrenamiento semanal
	// (si no estoy mal, es lo que se entreno en la semana).
	private int volumenEntrenamiento;
	
	// atributo relacion a clase Cliente
	// atributo relacion a clase Tutor
	// atributo relacion a clase Rutina
	// atributo relacion a clase Seguimiento

	
	// Constructor
	Entrenamiento(int paramIdEntre, Date paramFechaInicio, Date paramFechaFin){
		this.idEntrenamiento = paramIdEntre;
		this.puntaje = 0; // Al inicio es 0 hasta que el cliente lo puntue.
		this.fechaInicio = paramFechaInicio;
		this.fechaFin = paramFechaFin;
		this.volumenEntrenamiento = 0;
		// El volumen es 0 hasta que se empiece a registrar los
		// entrenamientos del cliente.
	}
	
	// Set
	public void setIdEntrenamiento(int valIdEntre){
		this.idEntrenamiento = valIdEntre;
	}
	
	public void setPuntaje(int valPuntaje){
		this.puntaje = valPuntaje;
	}
	
	public void setFechaInicio(Date valFechaInicio){
		this.fechaInicio = valFechaInicio;
	}
	
	public void setFechaFin(Date valFechaFin){
		this.fechaFin = valFechaFin;
	}
	
	public void setVolumenEntrenamiento(int valVE){
		this.volumenEntrenamiento = valVE;
	}
	
	// Get
	public int getIdEntrenamiento(){
		return this.idEntrenamiento;
	}
	
	public int getPuntaje(){
		return this.puntaje;
	}
	
	public Date getFechaInicio(){
		return this.fechaInicio;
	}
	
	public Date getFechaFin(){
		return this.fechaFin;
	}
	
	public int getVolumenEntrenamiento(){
		return this.volumenEntrenamiento;
	}
	
	// Metodos
}
