import java.util.Date;
import java.util.TreeSet;
public class ExemploSet2
{ 
 public static void main(String[] args)
 { 
	TreeSet<Object> set = new TreeSet<Object>();
	//set.add(new Integer(123));
	//set.add(123);
	set.add("ABC"); // !!!! erro em tempo de execucao
	set.add("ABC");
	//set.add(new Date()); // erro em tempo de execução
	//set.remove("ABC");
	//set.add(new Float(0.5)); // erro em tempo de execução
	set.add("Luciene");
	set.add("Carolina");
	set.add("Joao");
	set.add("Fernando");
	System.out.println(set);
 }
}