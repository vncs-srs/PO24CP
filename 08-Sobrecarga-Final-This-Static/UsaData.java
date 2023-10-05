public class UsaData{

	public static void main(String[] args){
	
		Data d = new Data();
		d.alterarData(31);
		d.alterarData(31,12);
		d.alterarData(31,12,1969);
		int x = d.alterarData(9,9,'a');
		System.out.println(x);
		
		Data e = (Data) d.clone();
		//System.out.println(e.alterarData(10,10,'b'));
		
	}
}	
