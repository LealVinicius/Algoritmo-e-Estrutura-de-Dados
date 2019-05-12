package recursividadeExercicios;

public class TestRecursividade {

	public static void main(String[] args) {
		ExerciciosRecursividade e = new ExerciciosRecursividade();
		
			int vet[] = new int[10];
			e.preencheVet(vet);
			System.out.println(" ==== Mostrando o vetor desordenado ===== ");
			e.mostrar(vet);
			
			System.out.println(" ==== Mostrando o vetor ordenado com bolha ===== ");
			e.bolha(vet);
			e.mostrar(vet);
			
			//bagunçando os valores
			e.preencheVet(vet);
			System.out.println(" ==== Mostrando o vetor desordenado novamente ===== ");
			e.mostrar(vet);
			
			System.out.println(" ==== Mostrando o vetor ordenado com insercao. ===== ");
			e.insercao(vet);
			e.mostrar(vet);
		
			e.preencheVet(vet);
			System.out.println(" ==== Mostrando o vetor ordenado com selecao. ===== ");
			e.selecao(vet);
			e.mostrar(vet);
		
		
				
				
	}

}
