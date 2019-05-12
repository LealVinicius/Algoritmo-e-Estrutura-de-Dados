package ordenacao3;

public class Insercao {
	
	  public static void preencheVet(int vet[]) {
		  for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 1000);
		}
	  }
		
	  public static void insercao(int vet[])
      {
         for(int i=1; i<vet.length; i++)
         {
            int aux = vet[i];
            int j = i-1;  
            while(j>=0 && vet[j]>aux)
            {
               vet[j+1] = vet[j];
               j--;
            }
             
            vet[j+1] = aux;
         }
      }
	  
	  public static void insercao2(int vet[])
      {
         for(int i=1; i<vet.length; i++)
         {
            int aux = vet[i];
            int j = i-1;  
            while(j<vet.length && vet[j]>aux)
            {
               vet[j+1] = vet[j];
               j++;
            }
            vet[j+1] = aux;
         }
      }
	public void mostrar(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(" i: " + i + " = " + vet[i]);
		}
		
	}
}
