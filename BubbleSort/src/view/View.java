package view;

import java.util.Scanner;
import modelo.Modelo;
import negocio.Negocio;

public class View {

	public static void main(String[] args) {
		 int tamanho = 10;
	        Modelo modelo = new Modelo(tamanho);
	        View visualizacao = new View();
	        Negocio controlador = new Negocio(modelo, visualizacao);
	        int[] numeros = visualizacao.inputNumeros(tamanho);
	        controlador.adicionarNumeros(numeros);
	        controlador.ordenarNumeros();
	    }

	    public int[] inputNumeros(int tamanho) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite " + tamanho + " números:");
	        int[] numeros = new int[tamanho];
	        for (int i = 0; i < tamanho; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        return numeros;
	    }

	    public void mostrarNumero(int numero, int indice) {
	        System.out.println("Número " + (indice + 1) + ": " + numero);
	    }
	}
	


