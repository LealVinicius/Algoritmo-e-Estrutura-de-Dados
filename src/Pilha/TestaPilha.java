//Aula feita com base no Blog do Professor Menezes;
// Foram feitos todos os exerc�cios corretamente. (Achei o assunto facinho)
// (pelo menos esse)/

package Pilha;
import javax.swing.JOptionPane;
public class TestaPilha
{ 
 public static void main(String[] args)
 {
//Instanciando o vetor da pilha,e passando o tamanho como par�metro.
  int tam = Integer.parseInt(JOptionPane.showInputDialog(" Para come�armos, insira o tamanho da pilha: "));
  Pilha p1 = new Pilha(tam);
  
  int x=-1;
  while 
	  (x != 0) {
	   x = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero: (0 para)"));
	  p1.empilhar(x);
   
  } 
  p1.mostrar();
  
  while (!p1.vazia() && p1.desempilhar()!=0) {
	  int aux = p1.desempilhar();
	  System.out.println("N�meros desempilhados: 0");
	  System.out.println(aux);
  }
 
  
 /* System.out.println("Soma entre os dois n�meros inseridos : " + p1.soma());
  System.out.println("subtra��o os dois n�meros inseridos : " + p1.subtracao());
  System.out.println("multiplica��o os dois n�meros inseridos : " + p1.multiplicacao());
  System.out.println("divis�o dos dois n�meros inseridos : "+p1.divisao());
  
		while (!p1.vazia()) {
			int aux = p1.desempilhar();
			System.out.print(aux);
			p2.empilhar(aux);
		}
		System.out.println(" ");
		while (!p2.vazia()) {
			System.out.print(p2.desempilhar());

 }
  */
  
 }
}
