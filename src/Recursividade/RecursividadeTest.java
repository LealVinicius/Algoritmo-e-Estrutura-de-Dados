package Recursividade;

import java.util.Arrays;

public class RecursividadeTest {

	public static void main(String[] args) {
		
		int vet[] = {4, 2,93, 2 , 5, 6};
		
		Recursividade r = new Recursividade();
		System.out.println(r.fibonacci(6));
		Arrays.sort(vet);
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]);
		}
	}

}
