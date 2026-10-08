import java.util.*;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private int qtdeNotas;
    private int[] pesos;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horasEstudo) {
        this.horasEstudo += horasEstudo;
    }
    public void cadastraNota(int indice, double valorNota) {
        this.notas[indice-1] = valorNota;
    }
    public double calculaMedia() {
        double numerador = 0;
        int denominador = 0;
        for(int i = 0; i < notas.length; i++) {
            numerador += notas[i] * pesos[i];
            denominador += pesos[i];
        }
        double media = numerador / denominador;
        return media;
    }
    public boolean aprovado() {
        if (calculaMedia() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }
    public Disciplina(int qtdeNotas) {
        this.qtdeNotas = qtdeNotas;
    }
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

