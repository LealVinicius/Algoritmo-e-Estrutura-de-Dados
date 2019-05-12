//Aula feita com base no Blog do Professor Menezes;
// Foram feitos todos os exercícios corretamente. (Achei o assunto facinho)
// (pelo menos esse)/

package Pilha;
import javax.swing.JOptionPane;
public class TestaPilha
{ 
 public static void main(String[] args)
 {
//Instanciando o vetor da pilha,e passando o tamanho como parâmetro.
  int tam = Integer.parseInt(JOptionPane.showInputDialog(" Para começarmos, insira o tamanho da pilha: "));
  Pilha p1 = new Pilha(tam);
  
  int x=-1;
  while 
	  (x != 0) {
	   x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: (0 para)"));
	  p1.empilhar(x);
   
  } 
  p1.mostrar();
  
  while (!p1.vazia() && p1.desempilhar()!=0) {
	  int aux = p1.desempilhar();
	  System.out.println("Números desempilhados: 0");
	  System.out.println(aux);
  }
 
  
 /* System.out.println("Soma entre os dois números inseridos : " + p1.soma());
  System.out.println("subtração os dois números inseridos : " + p1.subtracao());
  System.out.println("multiplicação os dois números inseridos : " + p1.multiplicacao());
  System.out.println("divisão dos dois números inseridos : "+p1.divisao());
  
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
