package com.adnj.buddysearchshareutils.enums.Converter;


import com.adnj.buddysearchshareutils.enums.ApplyStatus;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ApplyStatusConverter extends ValueCodeConverter<ApplyStatus> {
    public ApplyStatusConverter(Class<ApplyStatus> clz) {
        super(clz);
    }
    public ApplyStatusConverter() {
        super(ApplyStatus.class);
    }
}
