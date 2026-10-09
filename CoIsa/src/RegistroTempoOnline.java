/**
 * Representação do registro de tempo online dedicado a uma disciplina,
 * permitindo o controle das horas investidas e a verificação do atingimento da meta esperada.
 *
 * @author João Henrique de Andrade
 */
public class RegistroTempoOnline {

    /**
     * Nome da disciplina associada ao registro de tempo.
     */
    private String nomeDisciplina;

    /**
     * Tempo total investido online nas atividades da disciplina.
     */
    private int tempoInvestidoOnline;

    /**
     * Tempo esperado (meta) de dedicação online para a disciplina.
     */
    private int tempoEsperado;

    /**
     * Constrói um registro de tempo online para uma disciplina,
     * definindo o tempo esperado padrão como 120 horas.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }

    /**
     * Constrói um registro de tempo online para uma disciplina,
     * especificando o nome e o tempo esperado de dedicação.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoEsperado o tempo esperado (meta) de dedicação online
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
    }

    /**
     * Adiciona o tempo investido online nas atividades da disciplina.
     *
     * @param tempoInvestidoOnline o tempo em horas a ser adicionado
     */
    public void adicionaTempoOnline(int tempoInvestidoOnline) {
        this.tempoInvestidoOnline += tempoInvestidoOnline;
    }

    /**
     * Verifica se o tempo investido online atingiu ou superou a meta esperada.
     *
     * @return true se o tempo investido for maior ou igual ao esperado, false caso contrário
     */
    public boolean atingiuMetaTempoOnline() {
        if (tempoInvestidoOnline >= tempoEsperado) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna a representação em String do registro de tempo online,
     * contendo o nome da disciplina, o tempo investido e o tempo esperado no formato "Nome tempoInvestido/tempoEsperado".
     *
     * @return a representação textual do registro
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoInvestidoOnline + "/" + this.tempoEsperado;
    }
}
