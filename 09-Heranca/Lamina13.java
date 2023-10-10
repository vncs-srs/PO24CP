class OneDimPoint{
   
   int x;
   
   OneDimPoint(int startX){ 
     x = startX;  
   }
   
   int getX(){
     return x;
   }
}

class TwoDimPoint extends OneDimPoint{
   int y;
   TwoDimPoint(int startX, int startY){
     super(startX); // chamada explícita do construtor
     y = startY; 
   }
   int getY(){
     return y;
   }	
}


public class Lamina13{
   public static void main(String[] args){
   
      OneDimPoint p1 = new OneDimPoint(10);
      TwoDimPoint p2 = new TwoDimPoint(12,13);
      
      System.out.println("x: "+p1.getX());
      System.out.println("x: "+p2.getX()+", y: "+p2.getY()); 
   
   }

}
