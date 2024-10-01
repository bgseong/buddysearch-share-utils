package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.buddysearchshareutils.enums.ValueCodeScoreValue;
import jakarta.persistence.AttributeConverter;

import java.util.EnumSet;
import java.util.NoSuchElementException;

public class ValueCodeScoreValueConverter<E extends Enum<E> & ValueCodeScoreValue> implements AttributeConverter<E, Integer> {
    private Class<E> clz;

    public ValueCodeScoreValueConverter(Class<E> clz) {
        this.clz = clz;
    }

    @Override
    public E convertToEntityAttribute(Integer code) {
        return EnumSet.allOf(clz).stream()
                .filter(e -> e.getCode().equals(code))  // Enum의 코드와 데이터베이스에서 오는 int 값을 비교
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("Unknown enum code: " + code));
    }

    @Override
    public Integer convertToDatabaseColumn(E attribute) {
        return attribute.getCode();  // Enum의 int 코드 값을 반환
    }
}
