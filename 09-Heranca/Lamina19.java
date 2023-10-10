class Telefone{
	
}

class Semfio extends Telefone{
  
}

class Celular extends Semfio{
  
}

public class Lamina19{
	public static void main(String[] args){

              Telefone a = new Telefone();
              Semfio b = new Semfio();
              Celular c = new Celular();	

	      Telefone d = new Celular(); // Ok, coercao implicita
	      Object e = new Semfio();  // Ok, coercao implicita
	      Celular f = (Celular) d; // Ok, coercao explicita
	      
	      //Celular g = a; // Erro! Telefone não é Celular
	      Celular h = (Celular) e; //Erro (semantico) Semfio nao e Celular	
	      
	      
	}

}
