package visao;
import java.util.Scanner;
import modelo.Modelo;
import negocio.Negocio;

public class Visao {
	public static void main(String[] args) {
        int tamanho = 10;
        Modelo vetor = new Modelo(tamanho);
        Visao visualizacao = new Visao();
        Negocio controlador = new Negocio();

        visualizacao.EntrarNumero(vetor, tamanho);

        long tempoInicialInsertionSort = System.currentTimeMillis();
        controlador.insertionSort(vetor);
        long tempoFinalInsertionSort = System.currentTimeMillis();
        System.out.println("Insertion Sort executado em = " + (tempoFinalInsertionSort - tempoInicialInsertionSort) + " ms");

        long tempoInicialQuickSort = System.currentTimeMillis();
        controlador.quickSort(vetor,0,vetor.getNumeroElementos()-1);
        long tempoFinalQuickSor = System.currentTimeMillis();
        System.out.println("QuickSort executado em = " + (tempoFinalQuickSor - tempoInicialQuickSort) + " ms");
    }

    public void EntrarNumero(Modelo vetor, int tamanho) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite " + tamanho + " números:");
        for (int i = 0; i < tamanho; i++) {
            vetor.adicionarNumero(i, scanner.nextInt());
        }
    }
}
