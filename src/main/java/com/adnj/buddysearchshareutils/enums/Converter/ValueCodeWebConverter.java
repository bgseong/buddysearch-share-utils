package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.buddysearchshareutils.enums.ValueCode;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValueCodeWebConverter implements ConverterFactory<String, Enum<? extends ValueCode>> {

    @Override
    public <T extends Enum<? extends ValueCode>> Converter<String, T> getConverter(Class<T> targetType) {
        if (ValueCode.class.isAssignableFrom(targetType)) {
            return new LegacyCodeToEnumConverter<>(targetType);
        } else {
            return null;
        }
    }

    private static final class LegacyCodeToEnumConverter<T extends Enum<? extends ValueCode>> implements Converter<String, T> {

        private final Map<String, T> map;

        public LegacyCodeToEnumConverter(Class<T> targetEnum) {
            T[] enumConstants = targetEnum.getEnumConstants();
            map = Arrays.stream(enumConstants)
                    .collect(Collectors.toMap(enumConstant -> ((ValueCode) enumConstant).getValue(), Function.identity()));
        }

        @Override
        public T convert(String source) {
            //해당 값 존재 여부 확인
            if (!StringUtils.hasText(source)) {
                return null;
            }
            T enumValue = map.get(source);
            //해당 값이 map 에 존재하지 않을 경우 Exception 처리
            if (enumValue == null) {
                throw new IllegalArgumentException("IllegalArgumentException");
            }
            return enumValue;
        }
    }
}