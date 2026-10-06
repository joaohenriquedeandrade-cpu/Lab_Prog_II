public class RegistroResumos {
    private Resumo[] resumos;
    private int contador = 0;
    private String[] resumosExistentes;

    public RegistroResumos(int numeroResumos) {
        resumos = new Resumo[numeroResumos];
    }

    public void adiciona(String tema, String conteudo) {
        resumos[contador] = new Resumo(tema, conteudo);
        if (contador < resumos.length) {
            contador++;
        } else if (contador > resumos.length) {
            contador = 0;
        }
    }
    public String[] pegaResumos() {
        resumosExistentes = new String[contador];
        for ( int i = 0; i < contador; i++) {
            resumosExistentes[i] = resumos[i].toString();
        }
        return resumosExistentes;
    }
    public String imprimeResumos() {
        String frase = "- " + contador + " resumo(s) cadastrado(s)" + "\n";
        for (int i = 0; i < contador; i++) {
            if (i == contador - 1) {
                frase += resumos[i].getTema();
            } else {
                frase += resumos[i].getTema() + " | ";
            }
        }
        return frase;
    }
    public int conta() {
        return contador;
    }
    public boolean temResumo(String tema) {
        for (int i = 0; i < contador; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
                }
            }
        return false;
        }
    }


