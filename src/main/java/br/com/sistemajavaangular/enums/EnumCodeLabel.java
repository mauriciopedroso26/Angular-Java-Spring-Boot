package br.com.sistemajavaangular.enums;

/**
 * Interface padrão para os valores de Enum que possui um código relacionado a uma label.
 */
public interface EnumCodeLabel<T> {

    String HYPHEN = " - ";

    /**
     * Retorna o código do Enum.
     *
     * @return código do Enum.
     */
    T getCode();

    /**
     * Retorna o texto do Enum.
     *
     * @return texto do Enum.
     */
    String getLabel();

    /**
     * Retorna o texto da seguinte forma:
     * [Código] - [Texto]
     * 1 - Texto.
     *
     * @return texto formatado com código e texto.
     */
    default String getCodeLabel() {
        return getCode() + HYPHEN + getLabel();
    }
}
