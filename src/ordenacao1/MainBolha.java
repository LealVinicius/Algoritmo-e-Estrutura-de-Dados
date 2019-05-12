package ordenacao1;

public class MainBolha {
	
	public static void main(String[] args) {
	    Bubble b = new Bubble();
		int vet[] = new int [10];
		
		b.preencheVet(vet);
		b.bolha2(vet);
		b.mostrar(vet);
		b.ordenado(vet);
		

		b.bolha1(vet);
		b.mostrar(vet);
		b.ordenado(vet);
		

	}

}
