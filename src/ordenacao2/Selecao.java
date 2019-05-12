package ordenacao2;

/*
 * 4) Reescreva o método acima dividindo-o em dois
 * : um que descubra o índice do menor elemento de um vetor, 
 * a partir de um dado índice, e um outro que faça uso do primeiro para efetuar as 
 * devidas trocas e ordenar o vetor pela técnica da seleção. A assinatura dos métodos seria:

public static int indiceMenorElemento(int vet[], int inicio)     e
public static void selecao2(int vet[])
 */

public class Selecao {
	public void mostrar(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Vetor na posição "+i+" : "+ vet[i]);
		}
	}
	public void preencheVet(int vet[]) {
		for (int i=0; i<vet.length; i++) {
			vet[i] = (int) (Math.random() * 1000);
		}
	}

    public static void selecao (int vet[]) {
    	for (int i = 0; i < vet.length-1; i++) {
			int menor = i;
			for (int j = i+1; j < vet.length; j++) {
				if (vet[j] < vet[menor]) {
					menor = j;
				}	
					trocar(vet, i, menor);
			}
		}
    }
    
    public static void selecao2(int vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMenor = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j] < vet[indMenor])
                indMenor = j;
          }
          int aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
       }
    }
    
    public static int indiceMenorElemento(int vet[], int inicio) {
    	for (int i = 0; i < vet.length; i++) {
    		int menor = i;
			for (int j = 0; j < vet.length; j++) {
				if (vet[j] < vet[menor])
					menor = j;
			}
			inicio = menor;
		}
    	return inicio;
    }
	private static void trocar(int[] vet, int i, int menor) {
		int aux = vet[i];
		vet[i] = vet[menor];
		vet[menor] = aux;
		
		
	}
	
}
