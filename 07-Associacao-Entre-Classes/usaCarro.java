


public class usaCarro{

 public static void main(String[] argumentos){
 
    Motor x = new Motor(4,65,1);
    Carro fusca = new Carro("fusca",x);
    
    Carro uno = new Carro("uno",new Motor(4,70,1));
    
    Carro gol = new Carro("gol",new Motor(4,150,1));
    
    fusca.acelerar(15);
    uno.acelerar(15);
    gol.acelerar(15);
 }



}
