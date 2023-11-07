import java.util.Date;
import java.util.HashSet;
public class ExemploSet1
{ public static void main(String[] args)
 {
	HashSet<Object> set = new HashSet<Object>();
	set.add(new Integer(123));
	set.add(123);
	set.add(51);
	set.add("ABC");
	set.add("ABC");
	set.add(new Date());
	//set.remove(Date); Ver como remover objeto
	set.remove("123");
	System.out.println(set);
	// [Wed Nov 09 13:57:51 BRST 2016, 123]
 }
}