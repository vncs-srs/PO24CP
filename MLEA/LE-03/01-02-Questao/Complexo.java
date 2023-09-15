/*
Escreva em Java a classe Complexo que represente um número complexo. A classe deverá ter mais de um método construtor e os seguintes métodos:

inicializaNumero, que recebe dois valores como argumentos para inicializar os campos da classe (parte a e imaginária);
imprimeNumero, que deve imprimir o número complexo encapsulado usando a notação a+bi onde a é a parte a e b a imaginária;
eIgual, que recebe outra instância da classe Complexo e retorna true se os valores dos campos encapsulados forem iguais aos da instância passada como argumento;
soma, que recebe outra instância da classe Complexo e soma este número complexo com o encapsulado usando a fórmula (a+bi)+(c+di)=(a+c)+(b+d)i;
subtrai, que recebe outra instância da classe Complexo e subtrai o argumento do número complexo encapsulado usando a fórmula (a+bi)−(c+di)=(a−c)+(b−d)i;
multiplica, que recebe outra instância da classe Complexo e multiplica este número complexo com o encapsulado usando a fórmula (a+bi)∗(c+di)=(ac−bd)+(ad+bc)i;
divide, que recebe outra instância da classe Complexo e divide o número encapsulado pelo passado como argumento usando a fórmula  (a+bi)(c+di)=ac+bdc2+d2+bc−adc2+d2i;
*/

public class Complexo {
    private float a;
    private float b;

    public void inicializaNumero(float partea,float parteImaginaria){
        this.a = partea;
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

    public void imprimeNumero(float partea,float parteImaginaria){
        System.out.println(a + b );
    }
    public void soma(Complexo s){
        a = a+s.a;
        b = b+s.b;
    }
    public void subtrai(Complexo d){
        a = a-d.a;
        b = b-d.b;
    }
    public void multiplica(Complexo m){
        float tempa = (this.a * m.a) - (this.b * m.b);
        float tempb = (this.a * m.b) + (this.b * m.a);
        this.a = tempa;
        this.b = tempb;
    }
    public void divide(Complexo div){
        float tempa = ((this.a * div.a) + (this.b * div.b)) / ((div.a * div.a) + (div.b * div.b));
        float tempb = ((this.b * div.a) - (this.a * div.b)) / ((div.a * div.a) + (div.b * div.b));
        this.a = tempa;
        this.b = tempb;
    }
}
