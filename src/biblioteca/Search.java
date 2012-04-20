/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public class Search {
	static final int NOT_FOUND = -1;
	public int binSearch(int k, int[] v, int start, int end){
		int i = start, j = end, midPoint;
		while (i <= j){
			midPoint = (i + j) / 2;
			if (k == v[midPoint]) 		// Encontrou!
				return midPoint;
			else if (k > v[midPoint]) 		// Buscar no lado direito
					i = midPoint + 1;
			else 						// Buscar no lado esquerdo
					j = midPoint - 1;
		}
		return NOT_FOUND;
	}
	public int seqSearch(int k, int[] v){
		return binSearch(k, v, 0, v.length - 1);
	}
}
