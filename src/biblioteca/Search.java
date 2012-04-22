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

    public int binSearch(int k, int[] v, int start, int end) {
        int i = start, j = end, midPoint;
        while (i <= j) {
            midPoint = (i + j) / 2;
            if (k == v[midPoint]) // Encontrou!
            {
                return midPoint;
            } else if (k > v[midPoint]) // Buscar no lado direito
            {
                i = midPoint + 1;
            } else // Buscar no lado esquerdo
            {
                j = midPoint - 1;
            }
        }
        return NOT_FOUND;
    }

    public int seqSearch(int k, int[] v) {
        return binSearch(k, v, 0, v.length - 1);
    }

    protected int particionar(int[] v, int inicio, int fim) {
        int pivot, i, j;
        pivot = v[inicio];
        i = inicio + 1;
        j = fim;
        while (i < j) {
            if (v[i] < pivot) // os menores ficam a esquerda
            {
                i++;
            } else // os maiores ficam a direita
            {
                swap(v, i, j);
            }
        }
        // encaixe do pivot
        if (v[i] >= pivot) {
            i--;		// falta trocar o pivot de lugar com v[i]
        } else {
            j++;				// falta trocar o pivot de lugar com v[i]
        }
        swap(v, inicio, i);
        return i;
    }

    public void swap(int[] v, int i, int j) {
        int temp;
        temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public void quickSort(int[] v, int inicio, int fim) {
        // encerrar se apenas um elemento 
        int i;
        if (fim <= inicio) {
            return;
        }
        // particionar
        i = particionar(v, inicio, fim); // recursão à direita e à esquerda
	quickSort(v, inicio, i - 1);
        quickSort(v, i + 1, fim);
    }
}
