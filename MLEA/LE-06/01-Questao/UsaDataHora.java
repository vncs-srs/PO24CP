public class UsaDataHora {
    public static void main(String[] args) {
        DataHora dataHora1 = new DataHora((byte) 10, (byte) 10, (byte) 2023, (byte) 12, (byte) 9, (short) 2023);
        DataHora dataHora2 = new DataHora((byte) 10, (byte) 10, (byte) 2023, (byte) 12, (byte) 9, (short) 2023);

        System.out.println("DataHora 1: " + dataHora1);
        System.out.println("DataHora 2: " + dataHora2);

        if (dataHora1.eIgual(dataHora2)) {
            System.out.println("As datas e horas são iguais.");
        } else {
            System.out.println("As datas e horas são diferentes.");
        }
    }
}
