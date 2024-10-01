package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.buddysearchshareutils.enums.ValueCodeScoreValue;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValueCodeScoreValueWebConverter implements ConverterFactory<Integer, Enum<? extends ValueCodeScoreValue>> {

    @Override
    public <T extends Enum<? extends ValueCodeScoreValue>> Converter<Integer, T> getConverter(Class<T> targetType) {
        if (ValueCodeScoreValue.class.isAssignableFrom(targetType)) {
            return new IntegerToEnumConverter<>(targetType);
        } else {
            return null;
        }
    }

    private static final class IntegerToEnumConverter<T extends Enum<? extends ValueCodeScoreValue>> implements Converter<Integer, T> {

        private final Map<Integer, T> map;

        public IntegerToEnumConverter(Class<T> targetEnum) {
            T[] enumConstants = targetEnum.getEnumConstants();
            map = Arrays.stream(enumConstants)
                    .collect(Collectors.toMap(enumConstant -> ((ValueCodeScoreValue) enumConstant).getCode(), Function.identity()));
        }

        @Override
        public T convert(Integer source) {
            T enumValue = map.get(source);
            if (enumValue == null) {
                throw new IllegalArgumentException("Unknown enum code: " + source);
            }
            return enumValue;
        }
    }
}
