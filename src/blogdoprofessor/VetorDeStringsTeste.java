package blogdoprofessor;

import javax.swing.JOptionPane;

public class VetorDeStringsTeste {
	/*
		linearString(vetString, inserida);
	 */
	
	public static void main(String[] args) {
		VetorDeStrings v = new VetorDeStrings();
		String pString[] = new String[8];
		v.populaString(pString);
		v.mostraString(pString);
		String proc = JOptionPane.showInputDialog("Digite o valor que deseja encontrar no array: ");
		v.linearString(pString, proc);
		
		}
	}
