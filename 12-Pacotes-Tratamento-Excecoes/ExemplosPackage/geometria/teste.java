package geometria;
public class teste 
{
	protected int campo1;
	protected double campo2;
	Ponto2D objeto;
	
	public teste(int c1, double c2)
	{
		this.campo1 = c1;
		this.campo2 = c2;
		this.objeto = new Ponto2D(0.0,0.0);
		this.objeto.x = 10.0;
		this.objeto.y = 12.9;
	}
	public String toString()
	{
		return "Campo 1: "+campo1+" e campo2: "+campo2;
	}
}