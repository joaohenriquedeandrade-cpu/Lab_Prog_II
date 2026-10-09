import java.util.*;
/**
 * Representação da disciplina cursada por um estudante, responsável por armazenar
 * a quantidade de notas, as notas, os seus respectivos pesos e as horas de estudo
 * dedicadas para aquela determinada disciplina. Além do cálculo da média ponderada
 * para informar o status de aprovação.
 *
 * @author João Henrique de Andrade
 */

public class Disciplina {
    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;

    /**
     * Total de horas de estudo dedicadas à disciplina.
     */
    private int horasEstudo;

    /**
     * Quantidade de notas avaliadas na disciplina.
     */
    private int qtdeNotas;

    /**
     * Pesos associados a cada nota da disciplina.
     */
    private int[] pesos;

    /**
     * Notas obtidas nas avaliações da disciplina.
     */
    private double[] notas;

    /**
     * Constrói uma disciplina a partir do seu nome.
     * A quantidade padrão de notas é 4 e os pesos iniciais são iguais a 1.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.qtdeNotas = 4;
        notas = new double[qtdeNotas];
        pesos = new int[]{1, 1, 1, 1};
    }

    /**
     * Cadastra a quantidade de horas de estudo dedicadas à disciplina.
     *
     * @param horasEstudo as horas de estudo a serem somadas
     */
    public void cadastraHoras(int horasEstudo) {
        this.horasEstudo += horasEstudo;
    }
    /**
     * Cadastra uma nota em um determinado índice.
     *
     * @param indice    o índice da nota (de 1 até a quantidade de notas)
     * @param valorNota o valor da nota a ser cadastrada
     */
    public void cadastraNota(int indice, double valorNota) {
        this.notas[indice-1] = valorNota;
    }
    /**
     * Calcula e retorna a média ponderada das notas da disciplina.
     *
     * @return a média ponderada das notas
     */

    public double calculaMedia() {
        double numerador = 0;
        int denominador = 0;
        for (int i = 0; i < notas.length; i++) {
            numerador += notas[i] * pesos[i];
            denominador += pesos[i];
        }
        double media = numerador / denominador;
        return media;
    }
    /**
     * Verifica se o aluno está aprovado na disciplina com base na média ponderada.
     *
     * @return true se a média for maior ou igual a 7.0, false caso contrário
     */

    public boolean aprovado() {
        if (calculaMedia() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Constrói uma disciplina a partir da quantidade de notas.
     *
     * @param qtdeNotas a quantidade de notas da disciplina
     */
    public Disciplina(int qtdeNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.qtdeNotas = qtdeNotas;
        notas = new double[qtdeNotas];
        pesos = new int[]{1, 1, 1, 1};
    }
    /**
     * Constrói uma disciplina a partir do seu nome, da quantidade de notas e dos pesos.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param qtdeNotas      a quantidade de notas da disciplina
     * @param pesos          os pesos de cada nota
     */
    public Disciplina(String nomeDisciplina, int qtdeNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.qtdeNotas = qtdeNotas;
        notas = new double[qtdeNotas];
        this.pesos = pesos;
    }
    @Override
    public String toString() {
        String arrayNotas = Arrays.toString(notas);
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + arrayNotas;
    }
}

