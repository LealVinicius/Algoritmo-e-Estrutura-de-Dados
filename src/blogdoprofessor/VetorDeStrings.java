package blogdoprofessor;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class VetorDeStrings {
	
	public static String populaString(String vetString[]) {
		String insert = "";
			for (int i = 0; i <vetString.length; i++) {
				insert = JOptionPane.showInputDialog("Insira a " + i + " string.");
				vetString[i] = insert;
					} 
		 return insert;
	}
	public static void mostraString(String vetString[]) {
		for (int i = 0; i < vetString.length; i++) {
			System.out.println(vetString[i] + " ");
		}
	} 
	
	public static String linearString (String vet[], String procurada) {
		for (int i=0; i<vet.length; i++) {
			if (vet[i].equalsIgnoreCase(procurada)) {
			System.out.println("======= VETOR ENCONTRADO ======");
			System.out.println("i: " + i + ":" + vet[i]);
			return "i: " + i + ":" + vet[i];
			}
		}
	return "";
}
	
}