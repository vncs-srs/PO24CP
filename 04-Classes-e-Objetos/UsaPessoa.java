public class UsaPessoa{

	public static void main(String[] Args){
		Pessoa Ana = new Pessoa();

		Ana.setNome("Ana Paula de Oliveira");
		Ana.setCpf("123.456.789");
		Ana.setAnoNasc(1984);
		/*Pessoa Bete = new Pessoa("Bete");
		Pessoa Carlos = new Pessoa("Carlos", "333.444.555-66",1960);*/
		
		Ana.imprimirDados();
		/*Bete.imprimirDados();
		Carlos.imprimirDados();*/
	}
}