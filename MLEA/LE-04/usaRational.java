public class usaRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);

        System.out.print("r1: ");
        r1.printRational();
        
        
        System.out.print("r2: ");
        r2.printRational();

        r1.adicao(r2);
        System.out.print("r1 + r2: ");
        r1.printRational();
        r1.printDecimal(2);

        r1.subtracao(r2);
        System.out.print("r1 - r2: ");
        r1.printRational();
        r1.printDecimal(2);

        r1.multiplicacao(r2);
        System.out.print("r1 * r2: ");
        r1.printRational();
        r1.printDecimal(2);

        r1.divide(r2);
        System.out.print("r1 / r2: ");
        r1.printRational();
        r1.printDecimal(2);
    }
}
