class OneDimPoint{
   
   int x;
   
   OneDimPoint(){ 
     x = 3;  
   }
   
   int getX(){
     return x;
   }
}

class TwoDimPoint extends OneDimPoint{
   int y;
   TwoDimPoint(){
     y = 4; //chama primeiro OneDimPoint() automaticamente
   }
   int getY(){
     return y;
   }	
}


public class Lamina12{
   public static void main(String[] args){
      OneDimPoint p1 = new OneDimPoint();
      TwoDimPoint p2 = new TwoDimPoint();
      
      System.out.println("x: "+p1.getX());
      System.out.println("x: "+p2.getX()+", y: "+p2.getY()); 
   
   }

}
