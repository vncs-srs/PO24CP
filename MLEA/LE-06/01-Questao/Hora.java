class Hora {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public Hora(byte hora, byte minuto, byte segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public boolean eIgual(Hora outraHora) {
        return this.hora == outraHora.hora && this.minuto == outraHora.minuto && this.segundo == outraHora.segundo;
    }

    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
