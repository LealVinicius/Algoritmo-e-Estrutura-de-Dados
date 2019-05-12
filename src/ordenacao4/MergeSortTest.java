package ordenacao4;

import ordenacao3.Insercao;

public class MergeSortTest {

	public static void main(String[] args) {
		MergeSort i = new MergeSort();
		int[] vet = new int[10];
		i.preencheVet(vet);
		i.mergeSort(vet);
		i.mostrar(vet);

	}

}
