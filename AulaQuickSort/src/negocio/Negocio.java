package negocio;
import modelo.Modelo;
public class Negocio {
	 public void insertionSort(Modelo modelo) {
	        int[] numeros = new int[modelo.getNumeroElementos()];
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = modelo.getNumero(i);
	        }

	        int j;
	        int key;
	        int i;
	        for (j = 1; j < numeros.length; j++) {
	            key = numeros[j];
	            for (i = j - 1; (i >= 0) && (numeros[i] > key); i--) {
	                numeros[i + 1] = numeros[i];
	            }
	            numeros[i + 1] = key;
	        } 
	      

	        for (int k = 0; k < numeros.length; k++) {
	            System.out.println("Insertion Sort: " + numeros[k]);
	        }
	    }
	    public void quickSort(Modelo modelo, int inicio, int fim) {
	        int[] numeros = modelo.numeros;
	        quickSort(numeros, inicio, fim);
	        
	        for (int k = 0; k < numeros.length; k++) {
	            System.out.println("Quick Sort: " + numeros[k]);
	            System.out.println("-------------------- ");
	        }
	    }

	    private static void quickSort(int[] vetor, int inicio, int fim) {
	        if (inicio < fim) {
	            int posicaoPivo = separar(vetor, inicio, fim);
	            quickSort(vetor, inicio, posicaoPivo - 1);
	            quickSort(vetor, posicaoPivo + 1, fim);
	        }
	    }

	    private static int separar(int[] vetor, int inicio, int fim) {
	        int pivo = vetor[inicio];
	        int i = inicio + 1, f = fim;
	        while (i <= f) {
	            if (vetor[i] <= pivo)
	                i++;
	            else if (pivo < vetor[f]) {
	                f--;
	            }else {
	                int troca = vetor[i];
	                vetor[i] = vetor[f];
	                vetor[f] = troca;
	                i++;
	                f--;
	            }
	        }
	        for (int k=0;k<vetor.length;k++){
	        	System.out.println(vetor[k]);
	        	 System.out.println("-------------------- ");
	        	}
	        	vetor[inicio] = vetor[f];
	        	vetor[f] = pivo;
	        	return f;
	        	}
	        	
	        
}
