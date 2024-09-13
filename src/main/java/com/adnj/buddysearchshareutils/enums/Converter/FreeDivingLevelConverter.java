package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.mainserviceserver.enums.FreeDivingLevel;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class FreeDivingLevelConverter extends ValueCodeConverter<FreeDivingLevel>{
    public FreeDivingLevelConverter(Class<FreeDivingLevel> clz) {
        super(clz);
    }

    public FreeDivingLevelConverter() {
        super(FreeDivingLevel.class);
    }
}
