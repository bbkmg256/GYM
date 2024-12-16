
// Clase grupo muscular

/*

Un simple grupo muscular, al se relaciona con uno o mas ejercicios para
que la trabaje.

*/

package edu.unam.modelo;

/**
 *
 * @author bbkmg
 */
public class GrupoMuscular {
	// Atributos
	private int idGM;
	private String nombreGrupo;
	// atributo relacion con clase Ejercicio
	
	// Constructor
	GrupoMuscular(int paramIdGM, String paramNombreGrupo){
		this.idGM = paramIdGM;
		this.nombreGrupo = paramNombreGrupo;
	}
	
	// Set
	public void setIdGM(int valIdGM){
		this.idGM = valIdGM;
	}
	
	public void setNombreGrupo(String valNombreGrupo){
		this.nombreGrupo = valNombreGrupo;
	}
	
	// Get
	public int getIdGM(){
		return this.idGM;
	}
	
	public String getNombreGrupo(){
		return this.nombreGrupo;
	}
	
	// Metodos
}
