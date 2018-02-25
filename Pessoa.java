import java.*;
public class Pessoa {
	public double Telefone;
	public String Nome; 
	public double MostrarTelefone() {
		return this.Telefone;
	}
	public String MostrarNome() {
		return Nome;
	}
	public void InserirAltura(double Altura) {
		this.Telefone = Altura;
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
