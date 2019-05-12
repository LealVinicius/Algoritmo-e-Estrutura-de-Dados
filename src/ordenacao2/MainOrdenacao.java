package ordenacao2;

public class MainOrdenacao {

	public static void main(String[] args) {
		Selecao s = new Selecao();
		int vet[] = new int [10];
		s.preencheVet(vet);
		s.mostrar(vet);
		System.out.println("=======================");
		s.selecao(vet);
		s.mostrar(vet);
		
		
		
		}
		

	}


