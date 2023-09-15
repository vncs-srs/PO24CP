public class UsaArryDePontos2D{
	public static void main(String[] x){
		ArryDePontos2D a = new ArryDePontos2D(5);
		a.modifica(0,new Ponto2D(-1,-3));
		a.modifica(2,new Ponto2D(0,0));
		a.modifica(4,new Ponto2D(13,17));

		System.out.println(a);
	}
}
