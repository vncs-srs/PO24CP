/*
Escreva em Java a classe Complexo que represente um número complexo. A classe deverá ter mais de um método construtor e os seguintes métodos:

inicializaNumero, que recebe dois valores como argumentos para inicializar os campos da classe (parte real e imaginária);
imprimeNumero, que deve imprimir o número complexo encapsulado usando a notação a+bi onde a é a parte real e b a imaginária;
eIgual, que recebe outra instância da classe Complexo e retorna true se os valores dos campos encapsulados forem iguais aos da instância passada como argumento;
soma, que recebe outra instância da classe Complexo e soma este número complexo com o encapsulado usando a fórmula (a+bi)+(c+di)=(a+c)+(b+d)i;
subtrai, que recebe outra instância da classe Complexo e subtrai o argumento do número complexo encapsulado usando a fórmula (a+bi)−(c+di)=(a−c)+(b−d)i;
multiplica, que recebe outra instância da classe Complexo e multiplica este número complexo com o encapsulado usando a fórmula (a+bi)∗(c+di)=(ac−bd)+(ad+bc)i;
divide, que recebe outra instância da classe Complexo e divide o número encapsulado pelo passado como argumento usando a fórmula  (a+bi)(c+di)=ac+bdc2+d2+bc−adc2+d2i;
*/

public class Complexo {
    private float a;
    private float b;

    public void inicializaNumero(float parteReal,float parteImaginaria){
        this.a = parteReal;
        this.b = parteImaginaria;
    }
    public String toString() {
        if (b == 0) {
            return a + "";
        } else if (a == 0) {
            return b + "i";
        } else if (b < 0) {
            return a + " - " + (-b) + "i";
        } else {
            return a + " + " + b + "i";
        }
    }

    public void imprimeNumero(float parteReal,float parteImaginaria){
        System.out.println(a + b );
    }
    public void soma(int c,int d){
        a = (a+c);
        b = (b+d);
    }
    public void subtrai(float c,float d){
        a = (a-c);
        b = (b-d);
    }
    public void multiplica(float c,float d){
        a = ((a*c)+(b*d));
        b = ((a*d)+(b*c));
    }
    public void divide(float c,float d){
        a = ((a*c)+(b*d))/((c*c)+(d*d));
        b = ((b*c)-(a*d))/((c*c)+(d*d));
    }
}
