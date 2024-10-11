package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.buddysearchshareutils.enums.ValueCode;
import jakarta.persistence.AttributeConverter;

import java.util.EnumSet;
import java.util.NoSuchElementException;

public class ValueCodeConverter<E extends Enum<E> & ValueCode> implements AttributeConverter<E, Integer> {
    private Class<E> clz;

    public ValueCodeConverter(Class<E> clz) {
        this.clz = clz;
    }

    @Override
    public E convertToEntityAttribute(Integer s) {
        return EnumSet.allOf(clz).stream()
                .filter(e -> e.getCode().equals(s))
                .findAny()
                .orElseThrow(()->new NoSuchElementException());
    }

    @Override
    public Integer convertToDatabaseColumn(E e) {
        return e.getCode();
    }



}
