package ordenacao3;

public class InsercaoTest {

	public static void main(String[] args) {
		Insercao i = new Insercao();
		int[] vet = new int[10];
		i.preencheVet(vet);
		i.insercao(vet);
		i.mostrar(vet);
	}

}
