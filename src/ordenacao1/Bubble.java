package ordenacao1;

// https://www.caelum.com.br/apostila-java-orientacao-objetos/um-pouco-de-arrays/#arrays-de-referncias

/* O bolha verifica um por um, o que for maior, ele troca.
 * Com isso, o maior número já vai para o final.
 */

public class Bubble {
	
	
	public void preencheVet(int vet[]) {
		for (int i=0; i<vet.length; i++) {
			vet[i]  = (int) (Math.random() * 1000);
					
			}
		}

	 public static void bolha1(int vet[])
     {
        for(int i=1; i<vet.length; i++) {
           for(int j=0; j<vet.length-1; j++) {
              if(vet[j]<vet[j+1])
              {
                 int aux = vet[j];
                 vet[j] = vet[j+1];
                 vet[j+1] = aux;
              }
           }
        }
     }
	 
	   public static void bolha2(int vet[])
	      {
	         for(int i=1; i<=vet.length-1; i++)
	            for(int j=0; j<vet.length-i; j++)
	               if(vet[j]>vet[j+1])
	               {
	                  int aux = vet[j];
	                  vet[j] = vet[j+1];
	                  vet[j+1] = aux;
	               }
	      }
	   
	   public static void bolha3(int vet[])
	      {
	            int aux;
	            boolean troca;
	            int j=vet.length-1;

	            do {
	               troca=false;
	               for (int i=0; i<j; i++)
	                    if (vet[i]>vet[i+1]) {
	                          aux=vet[i];
	                          vet[i]=vet[i+1];
	                          vet[i+1]=aux;
	                          troca=true;
	                    }
	               j--;
	            }while (troca);
	      }
	   
	   public static boolean ordenado(int vet[]) {
		   int fim = vet.length-1;
		   if (vet[0] > vet[fim]) {
			   System.out.println(" Este vetor está ordenado de forma decrescente.");
			   return true;
		   } else
			   System.out.println(" Este vetor está ordenado de forma crescente.");
			   return false;
		   
	   }
	   
	   public void mostrar(int vet[]) {
		   for (int i=0; i<vet.length; i++) {
			   System.out.println(vet[i]);
		   }
	   }


}
