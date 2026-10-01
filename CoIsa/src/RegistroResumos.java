public class RegistroResumos {
    private Resumo[] resumos;
    private int contador = 0;

    public RegistroResumos(int numeroResumos) {
        resumos = new Resumo[numeroResumos];
    }
    public void adiciona(String tema, String conteudo) {
        resumos[contador] = new Resumo(tema, conteudo);
        contador++;
    }
    public String imprimeResumos() {
        return "-" + contador + "resumo(s) cadatrado(s)" + "\n" +;
    }
    public String[] pegaResumos() {
        String[] resumosExistentes = new String[contador];
        for(int j = 0; j < resumos.length; j++) {
            if (resumos[j] != null) {
                resumosExistentes[j] = resumos[j].toString();
            }
        }
    }
    public int conta() {
        return contador;
    }
}

