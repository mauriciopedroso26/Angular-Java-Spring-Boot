package br.com.sistemajavaangular.converter;

import br.com.sistemajavaangular.enums.RiscoEnum;

import javax.persistence.AttributeConverter;

public class RiscoEnumConverter implements AttributeConverter<RiscoEnum, Integer> {
    @Override
    public Integer convertToDatabaseColumn(RiscoEnum riscoEnum) {
        return riscoEnum.getCode();
    }

    @Override
    public RiscoEnum convertToEntityAttribute(Integer code) {
        return RiscoEnum.getValue(code);
    }
}
