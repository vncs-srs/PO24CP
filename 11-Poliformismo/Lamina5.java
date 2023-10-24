class Empregado{
	private String nome;
	
	public Empregado(String nome){
		this.nome = nome;
	}
	
	public String toString(){
		return "Nome: "+nome;
	}
}

class Gerente extends Empregado{
	private double bonus;
	
	public Gerente(String nome, double bonus){
		super(nome);
		this.bonus = bonus;
	}
	
	public String toString(){
		String aux = super.toString() + " - Bonus: " + bonus;
		return aux;
	}
}

public class Lamina5{

	public static void main(String[] args){

		Empregado[] emp = new Empregado[3];
		emp[0] = new Empregado("Empregado 1");
		emp[1] = new Empregado("Empregado 2");
		emp[2] = new Gerente("Empregado 3",20);
		
		for(int i = 0; i < emp.length;i++){
			System.out.println(emp[i]);
		}
	}
}
