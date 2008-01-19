/**
 * Contiene el conjunto de los problemas implementados seg�n el paradigma
 * del espacio de estados.
 */
package problemas;

import aima.search.*;
import java.util.*;

/**
 * 
 */
public abstract class Problema implements State,Heuristic{

	/**
	 * 
	 */
	public String enunciado;
	
	/**
	 * 
	 * @return 	 
	 */
	public abstract boolean isGoal();
	
	/**
	 * 
	 * @return 	 
	 */
	protected abstract boolean isValid();

	/**
	 * 
	 * @return 	 
	 */
	public abstract Enumeration successors();

	/**
	 * 
	 * @return 	 
	 */
	public abstract float h();
	
}
