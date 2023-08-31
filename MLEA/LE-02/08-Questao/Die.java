/*Crie uma classe Die com uma variável de instância inteira sideUp. Forneça a ela um 
construtor, um método getSideUp() que retorne o valor de sideUp e um método void roll() 
que altere o valor de sideUp para um valor aleatório de 1 a 6. */

import java.util.Random;

public class Die {
    private int sideUp;

    public Die(){
        sideUp = 6;
    }
    public Die(int s){
        sideUp = s;
    }
    public int getSideUp(){
        return sideUp;
    }
    public void roll(){
        Random x = new Random();
        sideUp = x.nextInt(6) + 1;
    }
    
}
