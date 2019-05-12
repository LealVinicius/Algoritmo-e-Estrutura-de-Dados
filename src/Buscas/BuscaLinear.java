// Pego do site

package Buscas;

import javax.swing.JOptionPane;

public class BuscaLinear {

		public static int buscaLinear(int vet[], int procurado) {
			for (int i=0; i<=vet.length; i++) {
				if (vet[i] == procurado) 
					return i;
			}
			return -1;
		}
		
		public static void main(String[] args) {
			
			
			int x[] = {5, 8, 9, 3, 2, -5, 0, 1};
			int procurado = Integer.parseInt(JOptionPane.showInputDialog("Insira o número: "));
			int resp = buscaLinear(x, procurado);
			if(resp == 1)
				JOptionPane.showMessageDialog(null, "Não existe no vetor.");
			else
				JOptionPane.showMessageDialog(null, "Está no índice " + resp);
		}
	}

