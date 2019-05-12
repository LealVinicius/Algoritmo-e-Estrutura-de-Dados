package blogdoprofessor;
public class Buscas 
{ 
    public static int buscaLinear (int vet[], int procurado) 
    { 
       for(int i = 0; i < vet.length-1; i++) 
       { 
          if(vet[i] == procurado) 
             return i;   
       } 
       return -1; 
    } 
    public static int buscaBinaria(int vet[], int procurado) {
      int inicio =0;
      int fim = vet.length -1;
      int cont=0;
      	while(inicio <= fim) {
      		int meio = (inicio+fim) /2;
      
       if (vet[meio] == procurado) {
    	   System.out.println("cont: " + cont);
    	   return meio;
       }
       else
       	if(vet[meio] > procurado) {
       		fim = meio - 1;
       		cont++;
       	}
       else 
       	if (vet[meio] < procurado)
       		inicio = meio + 1;
       		cont++;
      	}
      return -1;
      }
     
        
    public static void main (String args[]) 
   { 
    	
    //vet 1 pode ser feito na Linear, pois está bagunçado.	
      int vet1[] = {10, 4, 90, 9, 3, -1, 12, 15, 6}; 
      // vet 2 tem que ser feito na Sequencial, pois está ordenado.
      int vet2[] = {-1, 3, 4, 6, 7, 9, 10, 12, 15}; 
      
      //int respLinear = buscaLinear (vet1, proc); 
      int a = -1;
      int b = -1;
 
      int respBin = buscaBinaria (vet2, b); 
      int respBin2 = buscaLinear(vet1, a);
      
      //System.out.println ("Índice do "+ "em vet1: " + respLinear);
      System.out.println ("Índice do [" +  b +"] em vet2: " + respBin); 
      System.out.println("Indice do [" + a + "] em vet1(desordenado) :" + respBin2);
   } 
} 