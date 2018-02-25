import java.*;
public class Agenda {
	public int Ano;
	public float Altura;
	public boolean Ativo;
	Pessoa[] Pessoas;
	public String NomeArca;
	public String NomeDono;
	public void SetAno(int valor) {
		this.Ano = valor;
	}
	public void SetAltura(float valor) {
		this.Altura = valor;
	}
	public void SetAtivo(boolean Estado) {
		this.Ativo = Estado;
	}
	public void SetNomeArca(String Nome) {
		this.NomeArca = Nome;
	}
	public void SetNomeDono(String Nome) {
		this.NomeDono = Nome;
	}
	public int GetAno() {
		return this.Ano;
	}
	public float GetAltura() {
		return this.Altura;
	}
	public boolean GetState() {
		return this.Ativo;
	}
	public String GetNomeArca() {
		return this.NomeArca;
	}
	public String GetNomeDono() {
		return this.NomeDono;
	}
}
