public class Descanso {
    private int HorasDescanso;
    private int NumeroSemanas;

    public void defineHorasDescanso(int HorasDescanso) {
        this.HorasDescanso = HorasDescanso;
    }
    public void defineNumeroSemanas(int NumeroSemanas) {
        this.NumeroSemanas = NumeroSemanas;
    }
    public String getStatusGeral() {
        double valor = HorasDescanso / NumeroSemanas;

        if (valor >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
