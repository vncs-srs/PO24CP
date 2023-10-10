public class Telefone{
 private int codigo;
 private String numSerie, modelo;
 private float peso;
 private Dimensao dim;

 public Telefone(int c, String s, String m, float p, Dimensao d)
 {
  this.codigo = c; this.peso = p; this.dim = d;
  this.numSerie = s; this.modelo = m;
 }

 public void imprimirDados(){
  System.out.println ("Codigo: " + this.codigo);
   //...
  this.dim.imprimirDados();
 }
}

class Dimensao{
	private int largura, altura, profundidade;
	
	public Dimensao(int l, int a, int p){
	  largura = l;
	  altura = a;
	  profundidade = p;
	}
	public void imprimirDados(){
	  System.out.println("Dimensao (AxLxP): "+ this.altura + "x"+ this.largura+"x" + this.profundidade);
	}
}
