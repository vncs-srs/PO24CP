package produtos; //Classe SemFio na pasta produtos

public class SemFio extends Telefone{
	private float frequencia;
	
	public void modificador(){
		this.frequencia = 900; //acesso ok
		this.modelo = "ABC"; //acesso ok
		this.peso = (float) 0.5; //acesso ok
		this.marca = "GrandTel"; // Erro! Nao permitido
	
	
	}
}
