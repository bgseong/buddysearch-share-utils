package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.buddysearchshareutils.enums.ValueCodeScoreValue;
import jakarta.persistence.AttributeConverter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValueCodeScoreValueConverter<E extends Enum<E> & ValueCodeScoreValue> implements AttributeConverter<List<E>, String> {
    private Class<E> clz;

    public ValueCodeScoreValueConverter(Class<E> clz) {
        this.clz = clz;
    }

    @Override
    public String convertToDatabaseColumn(List<E> enumList) {
        if (enumList == null || enumList.isEmpty()) {
            return null;
        }
        return enumList.stream()
                .map(ValueCodeScoreValue::getCode)
                .map(String::valueOf)// 열거형 이름을 문자열로 변환
                .collect(Collectors.joining(",")); // 쉼표로 구분하여 연결
    }

    @Override
    public List<E> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return null;
        }
        Map<Integer, E> codeToEnumMap = Arrays.stream(clz.getEnumConstants())
                .collect(Collectors.toMap(ValueCodeScoreValue::getCode, Function.identity()));

        // 쉼표로 나누고 각 코드 값을 열거형으로 변환
        return Arrays.stream(dbData.split(","))
                .map(Integer::valueOf) // 문자열을 정수로 변환
                .map(codeToEnumMap::get) // 코드로 열거형으로 변환
                .collect(Collectors.toList());
    }
}
