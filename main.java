import java.util.*;	
public class main {
public static void main(String[] args) {
	  System.out.println("1- Tabuada\n2- Sequencia\n3- Sair");
	  Scanner Keyboard = new Scanner(System.in);
	  int Escolha =  Keyboard.nextInt();
	  if(Escolha == 1) {
		  System.out.println("\n\nDigite um Numero");
		  int Valor =  Keyboard.nextInt();
		  if(Valor >= 1 && Valor <= 10)
		  {
			  for(int x = 0; x != 11; x++) {
				  System.out.println("\n" + Valor*x);
			  }
		  }
	  }
	  else if(Escolha == 2) {
		  System.out.println("\n\nDigite um Numero");
		  int Valor =  Keyboard.nextInt();
		  if(Valor >= 0 && Valor <= 10)
		  {
			  int lul = Valor;
			  for(int x = 0; x != 11; x++) {
				  lul = Valor*lul;
				  System.out.println("\n" + lul);
			  }
		  }
	  }
	  else
	  {
		  return;
	  }
}
}
