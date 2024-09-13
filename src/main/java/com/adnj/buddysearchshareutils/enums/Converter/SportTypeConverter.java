package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.mainserviceserver.enums.SportType;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class SportTypeConverter extends ValueCodeConverter<SportType> {
    public SportTypeConverter(Class<SportType> clz) {
        super(clz);
    }
    public SportTypeConverter() {
        super(SportType.class);
    }

}
