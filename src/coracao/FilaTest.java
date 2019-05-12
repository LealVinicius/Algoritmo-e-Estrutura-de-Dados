package coracao;
public class FilaTest{
	public static void main(String args[])
	{
	
	Fila f = new Fila(1000);

   int mat[][]= {
         {0,0,1,1,1,1,0,0,1,1,1,1,0,0},
         {0,1,0,0,0,0,1,1,0,0,0,0,1,0},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {0,1,0,0,0,0,0,0,0,0,0,0,1,0},
         {0,0,1,0,0,0,0,0,0,0,0,1,0,0},
         {0,0,0,1,0,0,0,0,0,0,1,0,0,0},
         {0,0,0,0,1,0,0,0,0,1,0,0,0,0},
         {0,0,0,0,0,1,0,0,1,0,0,0,0,0},
         {0,0,0,0,0,0,1,1,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

   mostrarMatriz(mat);
   int x=2, y=2; //ponto de inicio da pintura  
   System.out.println("Coordenadas iniciais: x = " + x + ", y = " + y + "\n\n");
   
   
   
   f.enfileirar(x);
   f.enfileirar(y); 
   while(!f.vazia())
   {
      x=f.desenfileirar();
      y=f.desenfileirar(); 
      if(mat[x][y] == 0) //pode ser pintado?
      {
         mat[x][y] = 2; //pintei
         if((x+1)<mat.length && mat[x+1][y] == 0) //abaixo
         {
            f.enfileirar(x+1);
            f.enfileirar(y);
         }
      }
   }
 }

	private static void mostrarMatriz(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);
		}
		
	}
}
       
   
   