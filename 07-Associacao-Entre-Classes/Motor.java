public class Motor{

  private int cilindros;
  private int hp;
  private int giroAtual;
  
  public Motor(int c, int h, int g){
    cilindros = c;
    hp = h;
    giroAtual = g;
  }
  
  public void acelerar(int v){
    System.out.print("Estou acelerando com a forca");
    System.out.println(" "+cilindros*hp*giroAtual*v);
  }


}
