package ordenacao5;

public class QuickSort {
	public static void quickSort(int vet[]) {
		quickSort(vet, 0, vet.length - 1); 
	}
	private static void quickSort(int vet[], int inicio, int fim) {
		int pivo = particao(vet, inicio, fim);
		if (inicio < pivo - 1)
			quickSort(vet, inicio, pivo - 1);
		if (pivo < fim - 1)
			quickSort(vet, pivo + 1, fim);
	}

	private static int particao(int vet[], int inicio, int fim) {
		int i = inicio, j = fim, aux;
		int pivo = vet[inicio]; 
		while (i < j) {
			while (vet[j] > pivo) {
				j--;
			}
			if (i >= j) {
				return i;
			}
			aux = vet[i];
			vet[i] = vet[j];
			vet[j] = aux;
			i++;
			while (vet[i] < pivo) {
				i++;
			}
			aux = vet[i];
			vet[i] = vet[j];
			vet[j] = aux;
			j--;
		}
		return i;
	}

}
