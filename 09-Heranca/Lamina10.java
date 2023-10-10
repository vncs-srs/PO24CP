class Telefone{
   public void ola(){
      System.out.println("Ola, sou um telefone");
   }
}

class Semfio extends Telefone{
   public void ola(){
      System.out.println("Ola, sou um telefone sem fio");
   }
}

public class Lamina10{
   public static void main(String[] args){
      Telefone t = new Telefone();
      Semfio s = new Semfio();
      
      t.ola();
      s.ola(); 
   
   }

}
