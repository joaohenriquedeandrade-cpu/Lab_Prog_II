import java.util.Arrays;
import java.util.*;

/**
 * Representação de um registro de resumos, o qual permite o armazenamento,
 * listagem, contagem e busca de resumos por tema ou conteúdo.
 *
 * @author João Henrique de Andrade
 */
public class RegistroResumos {

    /**
     * Array que armazena os resumos cadastrados.
     */
    private Resumo[] resumos;

    /**
     * Contador da quantidade atual de resumos cadastrados.
     */
    private int contador = 0;

    /**
     * Índice que aponta para a próxima posição de inserção no array.
     */
    private int iResumo = 0;

    /**
     * Array auxiliar que armazena a representação textual dos resumos existentes.
     */
    private String[] resumosExistentes;

    /**
     * Constrói um registro de resumos com uma capacidade máxima definida.
     *
     * @param numeroResumos a capacidade máxima de resumos do registro
     */
    public RegistroResumos(int numeroResumos) {
        resumos = new Resumo[numeroResumos];
    }

    /**
     * Adiciona um novo resumo ao registro a partir de seu tema e conteúdo.
     * Caso o array atinja sua capacidade máxima, o comportamento circular
     * sobrescreve os resumos mais antigos a partir do início.
     *
     * @param tema o tema do resumo
     * @param conteudo o conteúdo detalhado do resumo
     */
    public void adiciona(String tema, String conteudo) {
        resumos[iResumo] = new Resumo(tema, conteudo);

        iResumo++;
        if (iResumo == resumos.length) {
            iResumo = 0;
        }
        if (contador < resumos.length) {
            contador++;
        }
    }

    /**
     * Retorna um array com a representação textual de todos os resumos cadastrados.
     *
     * @return um array de Strings contendo os resumos
     */
    public String[] pegaResumos() {
        resumosExistentes = new String[contador];
        for ( int i = 0; i < contador; i++) {
            resumosExistentes[i] = resumos[i].toString();
        }
        return resumosExistentes;
    }

    /**
     * Retorna uma String formatada contendo a quantidade de resumos cadastrados
     * e os temas de cada um deles separados por barras verticais.
     *
     * @return a representação em formato de texto dos resumos cadastrados
     */
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

    /**
     * Retorna a quantidade total de resumos cadastrados no registro.
     *
     * @return o número de resumos cadastrados
     */
    public int conta() {
        return contador;
    }

    /**
     * Verifica se já existe um resumo cadastrado com o tema especificado.
     *
     * @param tema o tema a ser pesquisado
     * @return true se o tema existir, false caso contrário
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < contador; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
                }
            }
        return false;
        }

    /**
     * Busca resumos cujo conteúdo contenha uma determinada chave de busca
     * (sem diferenciar letras maiúsculas e minúsculas) e retorna um array ordenado
     * com os temas correspondentes.
     *
     * @param chaveDeBusca o termo a ser buscado no conteúdo dos resumos
     * @return um array ordenado com os temas dos resumos encontrados
     */
    public String[] busca(String chaveDeBusca) {
        String[] ArrayTemp = new String[contador];
        int acumulador = 0;
        String chaveMinuscula = chaveDeBusca.toLowerCase();

        for(int i = 0; i < contador; i++) {
            Resumo novoResumo = resumos[i];
            if (novoResumo.getConteudo().toLowerCase().contains(chaveMinuscula)) {
                ArrayTemp[acumulador] = novoResumo.getTema();
                acumulador++;
            }
        }
        String[] resultado = Arrays.copyOf(ArrayTemp, acumulador);
        Arrays.sort(resultado);

        return resultado;
    }
}