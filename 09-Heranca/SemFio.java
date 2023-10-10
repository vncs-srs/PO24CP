public class SemFio extends Telefone{
 private float frequencia,distancia;
 private int canais;

 public SemFio(int c, String s, String m, float p, Dimensao d,
          int ca, float f, float dis){
    super(c, s, m, p, d); // invocando o construtor da superclasse
    this.frequencia = f;
    this.distancia = dis;
    this.canais = ca;
 }

 // sobreescrita do metodo da superclasse
 public void imprimirDados(){
    super.imprimirDados(); // invocando o metodo de mesmo nome 
                           //da superclasse
    System.out.println("Freq: " + this.frequencia);
    //...
 }
}
