public class Principal{

	public static void main(String[] args){

	 Thread f3 = new Fluxo3("fluxo 3") ;

	 //disparando a thread
	 f3.start();
	 System.out.println ("Depois do start e antes do join");
	 try {
		 f3.join( ) ;
		 // a linha abaixo e' executada somente depois
		 // de finalizar o metodo run do objeto f3
		 System.out.println("Depois do join") ;
	 }catch ( InterruptedException ex ) {
	 System.err.println (ex.toString());
	 }

	 System.out.println("Fim do programa");		

	}

}