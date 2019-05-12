package Pilha;

class Pilha {
	private int vet[];
	private int topo;

	public Pilha(int tamanho) {
		vet = new int[tamanho];
		topo = -1;
	}

	public void empilhar(int x) {
		topo++;
		vet[topo] = x;
	}

	public int desempilhar() {
		int aux = vet[topo];
		topo--;
		return aux;
	}

	public boolean vazia() {
		if (topo == -1)
			return true;
		else
			return false;
	}
	
	public int soma( ) {
		int soma = vet[topo] + vet[topo-1];
		return soma;
	}
	public int subtracao () {
		int sub = vet[topo] - vet[topo-1];
		return sub;
	}
	public int multiplicacao() {
		int multi = vet[topo] * vet[topo-1];
		return multi;
	}
	public double divisao() {
		double div = vet[topo] / vet[topo-1];
		return div;
	}

	public void mostrar() {
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		
	}
	
}