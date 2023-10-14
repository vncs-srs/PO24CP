class DataHora {
    private Data estaData;
    private Hora estaHora;

    public DataHora(byte hora, byte minuto, byte segundo, byte dia, byte mes, short ano) {
        estaData = new Data(dia, mes, ano);
        estaHora = new Hora(hora, minuto, segundo);
    }

    public DataHora(byte dia, byte mes, short ano) {
        estaData = new Data(dia, mes, ano);
        estaHora = new Hora((byte) 0, (byte) 0, (byte) 0);
    }

    public boolean eIgual(DataHora outraDataHora) {
        return this.estaData.eIgual(outraDataHora.estaData) && this.estaHora.eIgual(outraDataHora.estaHora);
    }

    public String toString() {
        return estaData.toString() + " " + estaHora.toString();
    }
}
