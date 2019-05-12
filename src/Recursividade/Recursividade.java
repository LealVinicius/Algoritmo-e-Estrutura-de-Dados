package Recursividade;

public class Recursividade {

	public static int somaVet(int vet[], int n) {
		if (n<0)
			return 0;
		else
			return somaVet(vet, n-1) + vet[n];
	}
	
	public static int fibonacci(int n) {
		if (n<=2)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
