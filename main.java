import java.util.*;	
public class main {
	public static PessoaEx3[] Nome;
public static void main(String[] args) {
	  System.out.println("Digite o nome de 5 pessoas");
	  Scanner Keyboard = new Scanner(System.in);
	  for(int x = 0;x != 6; x++) {
		  String nome = Keyboard.next();
		 Nome[x].InserirNome(nome);		 
		 int y = Keyboard.nextInt();
		 Nome[x].InserirIdade(y);		 
	  }
	  int MenorIdade = Nome[0].MostrarIdade();
	  String MenorNome =  Nome[0].MostrarNome();
	  for(int x =0; x != 6; x++) {
		  if(MenorIdade < Nome[x].MostrarIdade()) {
			  MenorIdade = Nome[x].MostrarIdade();
			  MenorNome =  Nome[x].MostrarNome();
		  }

	  }
	  System.out.println("Menor> "+ MenorNome + "/"+ MenorIdade + "Anos");
  }
}

