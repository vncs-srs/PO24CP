class OneDimPoint{
   
   int x = 3;
   
}

class TwoDimPoint extends OneDimPoint{
   int x = 4;
   int getSum(){
     return this.x + super.x;
   }	
}


public class Lamina14{
   public static void main(String[] args){
   
      OneDimPoint p1 = new OneDimPoint();
      TwoDimPoint p2 = new TwoDimPoint();
      
      System.out.println("Sum: "+p2.getSum()); 
   
   }

}
