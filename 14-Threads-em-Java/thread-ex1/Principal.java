public class Principal{

	public static void main(String[] args){

		Thread comHeranca   = new Fluxo1();
		Thread comInterface = new Thread(new Fluxo2());

		//disparando as threads
		comHeranca.start();
		comInterface.start();
		
		System.out.println("Fim do programa"); 

	}

}
