public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }
    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
    }
    public void adicionaTempoOnline(int tempoInvestidoOnline) {
        this.tempoInvestidoOnline += tempoInvestidoOnline;
    }
    public boolean atingiuMetaTempoOnline() {
        if (tempoInvestidoOnline >= tempoEsperado) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoInvestidoOnline + "/" + this.tempoEsperado;
    }
}
