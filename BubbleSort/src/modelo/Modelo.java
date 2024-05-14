package modelo;

public class Modelo {

	    private int[] numeros;

	    public Modelo(int tamanho) {
	        numeros = new int[tamanho];
	    }

	    public void adicionarNumero(int indice, int numero) {
	        numeros[indice] = numero;
	    }

	    public void ordenar() {
	        int tamanho = numeros.length;
	        for (int n = 1; n < tamanho; n++) {
	            for (int i = 0; i < tamanho - n; i++) {
	                if (numeros[i] > numeros[i + 1]) {
	                    int temp = numeros[i];
	                    numeros[i] = numeros[i + 1];
	                    numeros[i + 1] = temp;
	                }
	            }
	        }
	    }

	    public int getNumero(int indice) {
	        return numeros[indice];
	    }

	    public int getNumeroElementos() {
	        return numeros.length;
	    }
	}

