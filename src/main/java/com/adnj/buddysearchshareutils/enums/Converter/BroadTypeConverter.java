package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.buddysearchshareutils.enums.BroadType;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class BroadTypeConverter extends ValueCodeConverter<BroadType> {
    public BroadTypeConverter(Class<BroadType> clz) {
        super(clz);
    }

    public BroadTypeConverter() {
        super(BroadType.class);
    }
}
