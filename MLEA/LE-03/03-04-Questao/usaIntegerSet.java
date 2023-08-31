public class usaIntegerSet {
    public static void main(String[] argumentos){
        IntegerSet c1 = new IntegerSet();
        IntegerSet c2 = new IntegerSet();

        c1.insertElement(10);
        c1.insertElement(23);
        c1.insertElement(1);

        c2.insertElement(44);

        System.out.println(c1.toSetString());
        System.out.println(c2.toSetString());

        IntegerSet c3 = c1.union(c2);
        System.out.println(c3.toSetString());

        IntegerSet c4 = c1.intersection(c2);
        System.out.println(c4.toSetString());

        c1.deleteElement(23);

        System.out.println(c1.toSetString());
    }
}
