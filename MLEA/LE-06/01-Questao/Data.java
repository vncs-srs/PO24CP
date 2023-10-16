class Data {
    private byte dia;
    private byte mes;
    private short ano;

    public Data(byte dia, byte mes, short ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean eIgual(Data outraData) {
        return this.dia == outraData.dia && this.mes == outraData.mes && this.ano == outraData.ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
