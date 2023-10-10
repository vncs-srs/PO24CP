package poo; //Classe Principal na pasta poo
import produtos.Telefone;
import produtos.SemFio;


public class Principal{
   public static void main(String[] args){	
	
	Telefone t = new Telefone();
	SemFio sf = new SemFio();
	
	// invocando membro public
	t.peso = (float) 0.6;
	// invocando membro protected
	t.modelo = "DEF";  // erro!
	sf.modelo = "wqa"; // erro!
	
	sf.modificador(); //atraves do metodo correto!
	//invocando um membro private
	t.marca = "GT"; // erro!
	
   }
}
