public class usaComplexo {
    public static void main(String[] args) {
        Complexo c1 = new Complexo();
        c1.inicializaNumero(3, 4);
        System.out.println("Número complexo 1: " + c1.toString());

        Complexo c2 = new Complexo();
        c2.inicializaNumero(2, -5);
        System.out.println("Número complexo 2: " + c2.toString());
        
        // Adiciona os dois números complexos
        c1.soma(c2);
        System.out.println("Soma dos números complexos: " + c1.toString());

        // Subtrai os dois números complexos
        c1.subtrai(c2);
        System.out.println("Diferença dos números complexos: " + c1.toString());

        // Multiplica os dois números complexos
        c1.multiplica(c2);
        System.out.println("Produto dos números complexos: " + c1.toString());

        // Divide os dois números complexos
        c1.divide(c2);
        System.out.println("Quociente dos números complexos: " + c1.toString());
    }
}
