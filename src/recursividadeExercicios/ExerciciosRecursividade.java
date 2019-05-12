package recursividadeExercicios;

public class ExerciciosRecursividade {
	// Exercicio 1

	public static double fracoes1(double n) {
		if (n == 1)
			return 1;
		else
			return fracoes1(n--) + n / fracoes1(n + 1);
	}

	// Exercício n2
	// se for ímpar, soma com o n que está sendo chamado. Se for par, só tira um e
	// faz a chamda novamente.
	public static int nImpares(int n) {
		if (n == 0)
			return 0;
		if (!(n % 2 == 0))
			return nImpares(n - 1) + n;
		else
			return nImpares(n - 1);

	}

	// Exercicio 3
	public static double fracoes2(double n) {
		if (n==1) {
			return 1;
		}
		if (n % 2 == 0)
			return fracoes2(n-1) + n/ fracoes2(n + 2);
		else
			return fracoes2(n-1) - n / fracoes2(n + 2);
	}

	// Exercicio 4

	public static double pi(int n) {
			if (n==0) 
				return 0;
			 if (n%2==0) 
			   return 2 * n/(n-1) * n/(n+1);
			else 
				return 4 * (-1/n);
			}


	// Exercício 5
	// Método de popular array
	public void preencheVet(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 1000);
		}
	}

	// Método de mostrar
	public void mostrar(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(" i:" + vet[i]);
		}
	}

	// Busca Binária
	public static int buscaBinaria(int vet[], int procurado) {
		int inicio = 0;
		int fim = vet.length - 1;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;

			if (vet[meio] == procurado)
				return meio;
			else if (vet[meio] < procurado)
				inicio = meio + 1;
			else
				fim = meio - 1;
		}
		return -1;
	}

	// Ordenação Bolha
	public static void bolha(int vet[]) {
		for (int i = 1; i <= vet.length - 1; i++)
			for (int j = 0; j < vet.length - i; j++)
				if (vet[j] > vet[j + 1]) {
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
	}

	// Ordenação da seleção
	public static void selecao(int vet[]) {
		for (int i = 0; i < vet.length - 1; i++) {
			int indMenor = i;
			for (int j = i + 1; j < vet.length; j++) {
				if (vet[j] < vet[indMenor])
					indMenor = j;
			}
			int aux = vet[i];
			vet[i] = vet[indMenor];
			vet[indMenor] = aux;
		}
	}

	// Ordenação da inserção
	public static void insercao(int vet[]) {
		for (int i = 1; i < vet.length; i++) {
			int aux = vet[i];
			int j = i - 1;
			while (j >= 0 && vet[j] > aux) {
				vet[j + 1] = vet[j];
				j--;
			}
			vet[j + 1] = aux;
		}
	}
}
