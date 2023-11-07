import java.util.ArrayList;
import java.util.Collections;
public class Sorteio
{
 public static void main(String[] args)
 {  //construtor definindo uma capacidade inicial
	ArrayList<Integer> numeros = new ArrayList<Integer>(60);
	//System.out.println(numeros);
	for(int i=1;i<=60;i++) numeros.add(i);
	//System.out.println(numeros);
	//Collections.shuffle(numeros);
	for(int i=0;i<60;i++) System.out.print(numeros.get(i)+" ");
	// 7 59 16 51 36 58
 }
}