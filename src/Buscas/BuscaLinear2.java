package Buscas;

import javax.swing.JOptionPane;

public class BuscaLinear2 {


	public static int buscaLinear(int vet[], int procurado) {
		for(int i=0; i < vet.length; i++) {
			if (procurado == vet[i]) 	
				return i;
		}	
		return -1;
	} 
	
	
	// Vetor TEM que estar ordenado
	public static int buscaBinaria(int vet[], int procurado) {
		int inicio = 0;
		int fim = vet.length-1;
			while (inicio<=fim) {
				int meio = inicio+fim/2;
			if (vet[meio] == procurado)
				return meio;
			else
				if(vet[meio] > procurado)
				fim = meio -1;
			else 
				if (vet[meio] < procurado)
				inicio = meio+1;
				return vet[meio];
			}
		return -1;
	}


	public static void main(String[] args) {
		int vet[] = {4, 7, 78, 90};
		int procurado = Integer.parseInt(JOptionPane.showInputDialog("Insira o procurado: " ));
		int resp = buscaBinaria(vet, procurado);
		if (resp == 1) 
			JOptionPane.showMessageDialog(null, "Não está no vetor.");
		else 
			JOptionPane.showMessageDialog(null, "Está na posição " + resp);
	}
}