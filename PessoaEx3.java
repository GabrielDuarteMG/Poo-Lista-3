import java.*;
public class PessoaEx3 {
	public int Idade;
	public String Nome; 
	public int MostrarIdade() {
		return this.Idade;
	}
	public String MostrarNome() {
		return Nome;
	}
	public void InserirIdade(int Idade) {
		this.Idade = Idade;
	}
	public void InserirNome(String Nome) {
		this.Nome = Nome;
	}
	public void Andar() {
		System.out.println(MostrarNome() + " esta Andando");
	}
	public void Correr() {
		System.out.println(MostrarNome() + " esta Correndo");
	}
	public void Falar() {
		System.out.println(MostrarNome() + " esta Conversando");
	}
}
