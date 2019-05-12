package blogdoprofessor;

public class Buscas2 
{ 
    public static int buscaLinearModificada (int vet[], int procurado) 
   { 
       int cont = 1; 
      for(int i = 0; i < vet.length; i++) 
      { 
         if(vet[i] == procurado) 
           return cont;
         cont++;            
      } 
      return -1; 
   }    
        
    public static int buscaBinariaModificada (int vet[], int procurado) 
   { 
       int cont = 1; 
      int inicio = 0; 
      int fim = vet.length - 1; 
           
      while(inicio <= fim) 
      { 
         int meio = (inicio + fim) / 2; 
              
         if(vet[meio] == procurado) 
           return cont;    
        	
         else
            if (vet[meio] < procurado) 
               inicio = meio + 1; 
            else
               fim = meio - 1; 
          
          cont++; 
      } 
      return -1; 
   } 
        
    public static void main (String args[]) 
   { 
      int vet[] = new int[1000];       
      for(int i=0; i<1000; i++) vet[i] = i;        
      int tempoLinear = 0, tempoBinaria = 0; 
      for(int i=0; i < 2000; i++) 
      { 
           int aleatorio = (int) (Math.random()*1000); 
       
           tempoLinear = tempoLinear + buscaLinearModificada(vet, aleatorio); 
           tempoBinaria = tempoBinaria + buscaBinariaModificada(vet, aleatorio); 
      } 
       
      tempoLinear = tempoLinear/2000; 
      tempoBinaria = tempoBinaria/2000; 
    
      System.out.println ("Tempo médio da Busca Linear: " + tempoLinear); 
      System.out.println ("Tempo médio da Busca Binária: " + tempoBinaria); 
      System.out.println ("Tempo mínimo da Busca linear: "  );
   } 
    }