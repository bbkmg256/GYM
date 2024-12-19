
// Clase seguimiento

/*

Se supone que esta clase va a servir como registro de lo que realiza el cliente
acá se debería detallar cuanto se ejercito y que ejercicios realizo, entre otras
cosas.

*/

package edu.unam.modelo;

import java.util.Date;

/**
 *
 * @author bbkmg
 */
public class Seguimiento {
	//Atributos
	private int idSeguimiento;
	private Date fechaHoy;
	private int cantSerieRealizado;
	private int cantRepeticionesRealizado;
	private String ejercicioRealizado;
	private double pesoTrabajado;
	
	// Constructor
	Seguimiento(int paramIdSeg, int paramCantSeries, int paramCantRep,
		String paramEjer, double paramPesoTrabajado){
		
		this.idSeguimiento = paramIdSeg;
		this.fechaHoy = null; // Ver como se obtiene la fecha actual del sistema.
		this.cantSerieRealizado = paramCantSeries;
		this.cantRepeticionesRealizado = paramCantRep;
		this.ejercicioRealizado = paramEjer;
		this.pesoTrabajado = paramPesoTrabajado;
	}
	
	// Set
	public void setIdSeguimiento(int valIdSeg){
		this.idSeguimiento = valIdSeg;
	}
	
	public void setFechaHoy(Date valFechaHoy){
		this.fechaHoy = valFechaHoy;
	}
	
	public void setCantSerieRealizado(int valCantSerieRelizado){
		this.cantSerieRealizado = valCantSerieRelizado;
	}
	
	public void setCantRepeticionRealizado(int valCantRepeticionRealizado){
		this.cantRepeticionesRealizado = valCantRepeticionRealizado;
	}
	
	public void setEjercicioRealizado(String valEjercicioRealizado){
		this.ejercicioRealizado = valEjercicioRealizado;
	}
	
	public void setPesoTrabajado(double valPesoTrabajado){
		this.pesoTrabajado = valPesoTrabajado;
	}
	
	// Get
	public int getIdSeguimiento(){
		return this.idSeguimiento;
	}
	
	public Date getFechaHoy(){
		return this.fechaHoy;
	}
	
	public int getCantSerieRealizado(){
		return this.cantSerieRealizado;
	}
	
	public String getEjercicioRealizado(){
		return this.ejercicioRealizado;
	}
	
	public double getPesoTrabajado(){
		return this.pesoTrabajado;
	}
	
	// Metodos
}
