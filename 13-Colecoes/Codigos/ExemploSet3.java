import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
public class ExemploSet3
{
 public static void main(String[] args)
 {
	HashSet<Object> set = new HashSet<Object>();
	set.add(new Integer(123)); set.add(333);
	set.add("ABC"); set.add("DDD");
	set.add(new Date());
	set.add("CCC");
	Iterator<Object> i = set.iterator();
	while(i.hasNext())
	{
		Object o = i.next();
		if (o instanceof Date)
		//System.out.println("Achei uma string:"+o);
	    //set.remove(o);
	}
	// Achei um Integer:123
	System.out.println(set);
 }
}