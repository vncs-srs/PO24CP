/*Em seguida, crie uma classe DieDemo com um método principal que gere dois 
objetos Die, jogue-os e exiba a soma dos dois lados superiores.*/
import java.util.Random;
public class DieDemo {
    public static void main(String[]argumentos){
        Die d1 = new Die();
        Die d2 = new Die(5);

        d1.roll();
        d2.roll();

        int soma = d1.getSideUp() + d2.getSideUp();

        System.out.println("Soma dos dados: "+ soma);

    }
}
