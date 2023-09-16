/*
Crie uma classe chamada Rational para realizar aritmética com frações. Utilize variáveis do tipo 
inteiro para representar as variáveis de instância private da classe - o numerator e o denominator. 
Forneça um construtor que permita que um objeto dessa classe seja inicializado quando ele for declarado. 
O construtor deve armazenar a fração em uma forma reduzida. A fração 24 é equivalente a 12 e seria 
armazenada no objeto como 1 no numerator e 2 no denominator. Forneça um construtor sem argumento com 
valores-padrão caso nenhum inicializador seja fornecido. Forneça métodos public que realizam cada uma 
das operações a seguir:

Somar dois números Rational: O resultado da adição deve ser armazenado na forma reduzida.
Subtrair dois números Rational: O resultado da subtração deve ser armazenado na forma reduzida.
Multiplicar dois números Rational: O resultado da multiplicação deve ser armazenado na forma reduzida.
Dividir dois números Rational: O resultado da divisão deve ser armazenado na forma reduzida
Imprimir números Rational  na forma a/b, onde a é o numerator e b é o denominator.
Imprimir os números Rational no formato de ponto flutuante. (Considere a possibilidade de fornecer 
capacidades de formatação que permitam que o usuário da classe especifique o número de dígitos de 
precisão à direita do ponto de fração decimal.
*/
import java.text.DecimalFormat;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        int mdc = mdc(numerator, denominator);
        this.numerator = numerator / mdc;
        this.denominator = denominator / mdc;
    }

    private int mdc(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return mdc(num2, num1 % num2);
    }

    public void adicao(Rational r) {
        this.numerator = this.numerator * r.denominator + r.numerator * this.denominator;
        this.denominator = this.denominator * r.denominator;
        int mdc = mdc(this.numerator, this.denominator);
        this.numerator /= mdc;
        this.denominator /= mdc;
    }

    public void subtracao(Rational r) {
        this.numerator = this.numerator * r.denominator - r.numerator * this.denominator;
        this.denominator = this.denominator * r.denominator;
        int mdc = mdc(this.numerator, this.denominator);
        this.numerator /= mdc;
        this.denominator /= mdc;
    }

    public void multiplicacao(Rational r) {
        this.numerator *= r.numerator;
        this.denominator *= r.denominator;
        int mdc = mdc(this.numerator, this.denominator);
        this.numerator /= mdc;
        this.denominator /= mdc;
    }

    public void divide(Rational r) {
        if (r.numerator != 0) {
            this.numerator *= r.denominator;
            this.denominator *= r.numerator;
            int mdc = mdc(this.numerator, this.denominator);
            this.numerator /= mdc;
            this.denominator /= mdc;
        } else {
            System.out.println("Erro: Divisão por zero!");
        }
    }

    public void printRational() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public void printDecimal(int precisao) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(precisao);
        System.out.println("= " + df.format((double) this.numerator / this.denominator));
    }
}
