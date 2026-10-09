/**
 * Representação da rotina de descanso, ele deve descansar 26 horas por semana, ou mais, para se considerar descansado.
 * Considera-se que o aluno começa cansado.
 *
 * @author João Henrique de Andrade
 */
public class Descanso {

    /**
     * Horas de descanso do aluno. No formato X, em que x é a quantidade de horas descansados pelo aluno.
     */
    private int HorasDescanso;

    /**
     * Números de semanas que compõem a rotina do aluno. No formato X, em que X é a quantidade de semanas.
     */
    private int NumeroSemanas;

    /**
     * Registra a quantidade de horas de descanso que o aluno teve na semana.
     */
    public void defineHorasDescanso(int HorasDescanso) {
        this.HorasDescanso = HorasDescanso;
    }

    /**
     * Registra a quantidade de semanas em que o aluno esteve seguindo a rotina.
     */
    public void defineNumeroSemanas(int NumeroSemanas) {
        this.NumeroSemanas = NumeroSemanas;
    }

    /**
     * Retorna a String que representa se o aluno está descansado ou cansado. A representação segue o
     * formato "cansado", se o aluno descansou menos de 26 horas por semana e "descansado"  se o aluno
     * descansou mais de 26 horas por semana.
     *
     * @return a representação em String do estado de descanso do aluno.
     */
    public String getStatusGeral() {
        if (NumeroSemanas == 0 || HorasDescanso == 0) {
            return "cansado";
        } else {
            double valor = HorasDescanso / NumeroSemanas;

            if (valor >= 26) {
                return "descansado";
            } else {
                return "cansado";
            }
        }
    }
}
