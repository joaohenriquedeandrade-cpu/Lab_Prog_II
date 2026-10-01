import java.util.*;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = {0, 0, 0, 0};

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horasEstudo) {
        this.horasEstudo = horasEstudo;
    }
    public void cadastraNota(int indice, double valorNota) {
        this.notas[indice-1] = valorNota;
    }
    public double calculaMedia() {
        double soma = 0;
        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / 4;
    }
    public boolean aprovado() {
        if (calculaMedia() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        String arrayNotas = Arrays.toString(notas);
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + arrayNotas;
    }
}

