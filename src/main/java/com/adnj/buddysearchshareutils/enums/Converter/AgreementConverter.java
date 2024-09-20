package com.adnj.buddysearchshareutils.enums.Converter;


import com.adnj.buddysearchshareutils.enums.AgreementType;

public class AgreementConverter extends ValueCodeConverter {
    public AgreementConverter(Class<AgreementType> clz) {
        super(clz);
    }
    public AgreementConverter() {
        super(AgreementType.class);
    }
}
