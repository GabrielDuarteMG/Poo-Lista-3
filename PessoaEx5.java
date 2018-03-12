import java.*;
public class PessoaEx5 {
	public double Telefone;
	public String Nome; 
	public String Endereco; 
	public PessoaEx5(String Nome,String Endereco,double Telefone) {
		this.Telefone = Telefone;
		this.Endereco = Endereco;
		this.Nome = Nome;
	}
	public double MostrarTelefone() {
		return this.Telefone;
	}
	public String MostrarNome() {
		return Nome;
	}
	public String MostrarEndereco() {
		return Endereco;
	}
	public void inserirTelefone(double Telefone) {
		this.Telefone = Telefone;
	}
	public void InserirNome(String Nome) {
		this.Nome = Nome;
	}
	public void InserirEndereco(String Endereco) {
		this.Endereco = Endereco;
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