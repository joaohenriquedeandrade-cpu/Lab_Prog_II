/**
 * Representação de um resumo sobre determinado tema de estudo.
 * Todo resumo possui um tema e um conteúdo correspondente.
 *
 * @author João Henrique de Andrade
 */
public class Resumo {

    /**
     * Tema principal abordado no resumo.
     */
    private String tema;

    /**
     * Texto com o conteúdo detalhado do tema escolhido para o resumo.
     */
    private String conteudo;

    /**
     * Constrói um resumo a partir de seu tema e conteúdo.
     *
     * @param tema o tema escolhido para resumo
     * @param conteudo o texto descritivo do conteúdo relacionado ao tema.
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo= conteudo;
    }

    /**
     * Retorna a String que representa o resumo. A representação segue o
     * formato “TEMA: CONTEUDO”.
     *
     * @return a representação em String de um resumo.
     */
    @Override
    public String toString() {
        return tema + ": " + conteudo;
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return o tema do resumo.
     */
    public String getTema() {
        return tema;
    }

    /**
     * Retorna o conteúdo do resumo.
     *
     * @return o conteúdo do resumo.
     */
    public String getConteudo() {
        return conteudo;
    }
}
