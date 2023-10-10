public class Principal{
    public static void main(String[] args ){
    
	Telefone t = new Telefone (1, "ABC123", "MesaTel", 0.5f, new Dimensao(10, 10, 5));
	SemFio  sf = new SemFio (2, "DEF456", "LivreTel" , 0.7f , new Dimensao(20, 8, 7), 11, 2400f,100f);
	t.imprimirDados();
	sf.imprimirDados();
   }

}
