package br.com.sistemajavaangular.enums;

import java.util.stream.Stream;

public enum RiscoEnum implements EnumCodeLabel<Integer> {

    A(1, "A"),
    B(2, "B"),
    C(3, "C");

    private Integer code;
    private String label;


    RiscoEnum(Integer code, String label) {
        this.code = code;
        this.label = label;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getLabel() {
        return label;
    }

    /**
     * Converte integer em {@link RiscoEnum} baseado no seu code.
     * Se for passado caracter que não existe no enum, é disparada {@link IllegalArgumentException}
     *
     * @param code valor do enum
     * @return {@link RiscoEnum}
     */
    public static RiscoEnum getValue(Integer code) {
        return Stream.of(values()).filter(e -> e.code.equals(code)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Código não existe no RiscoEnum: "
                        + "codigo=" + code));
    }
}
