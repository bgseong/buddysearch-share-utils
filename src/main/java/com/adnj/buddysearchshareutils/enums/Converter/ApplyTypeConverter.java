package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.mainserviceserver.enums.ApplyType;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ApplyTypeConverter extends ValueCodeConverter<ApplyType> {
    public ApplyTypeConverter(Class<ApplyType> clz) {
        super(clz);
    }
    public ApplyTypeConverter() {
        super(ApplyType.class);
    }

}
