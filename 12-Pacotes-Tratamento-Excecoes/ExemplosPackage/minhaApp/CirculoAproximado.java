package minhaApp;
import geometria.Circulo;
import geometria.Ponto2D;
public class CirculoAproximado extends Circulo
{
	// O construtor parametrico deve existir.
	public CirculoAproximado(Ponto2D centro, double raio)
	{
		super(centro, raio);
	}
	public double calculaArea()
	{
		return 3.14*raio*raio;
	}
	//protected double calculaPerimetro() // Erro de compilacao!
	public double calculaPerimetro() // Sem erro de compilacao!
	{
		return 3.14*Math.PI*raio;
	}
}
