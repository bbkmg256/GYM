
// Clase tutor

/*

El tutor imparte el entrenamiento al cliente, fin.

*/

package edu.unam.modelo;

import java.util.Date;

/**
 *
 * @author bbkmg
 */
public class Tutor {
	// Atributos
	private int dni;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private char sexo;
	private String ciudad;
	private String provincia;
	private int codigoPostal;
		
	// Constructor
        Tutor(int paramDni, String paramNombre, String paramApellido,
		Date paramFechaNac, char paramSexo, String paramCiudad,
		String paramProvincia, int paramCodPost, Date paramFechaIng){
		
		this.dni = paramDni;
		this.nombre = paramNombre;
		this.apellido = paramApellido;
		this.fechaNacimiento = paramFechaNac;
		this.sexo = paramSexo;
		this.ciudad = paramCiudad;
		this.provincia = paramProvincia;
		this.codigoPostal = paramCodPost;
        }
	
	// Set
	public void setDni(int valDni){
		this.dni = valDni;
	}
	
	public void setNombre(String valNombre){
		this.nombre = valNombre;
	}
	
	public void setApellido(String valApellido){
		this.apellido = valApellido;
	}
	
	public void setFechaNacimiento(Date valFechaNac){
		this.fechaNacimiento = valFechaNac;
	}
	
	public void setSexo(char valSexo){
		this.sexo = valSexo;
	}
	
	public void setCiudad(String valCiudad){
		this.ciudad = valCiudad;
	}
	
	public void setProvicia(String valProvincia){
		this.provincia = valProvincia;
	}
	
	public void setCodigoPostal(int valCodPost){
		this.codigoPostal = valCodPost;
	}	
	
	// Get
	public int getDni(){
		return this.dni;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public Date getFechaNacimiento(){
		return this.fechaNacimiento;
	}
	
	public char getSexo(){
		return this.sexo;
	}
	
	public String getCiudad(){
		return this.ciudad;
	}
	
	public String getProvincia(){
		return this.provincia;
	}
	
	public int getCodPost(){
		return this.codigoPostal;
	}
	
	// Metodos
}
