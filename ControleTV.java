
public class ControleTV extends TV {
	public ControleTV() {
		
	}
	public void DefinirVolume(int Volume) {
		Sistema_De_Som.setVolume(Volume);
	}
	public void DefinirCanal(float Frquencia) {
		Antena_De_Transmissao.Frequencia = Frquencia;
	}
}
