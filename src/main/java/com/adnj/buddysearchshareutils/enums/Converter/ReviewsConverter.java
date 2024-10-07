package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.buddysearchshareutils.enums.Reviews;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ReviewsConverter extends ValueCodeScoreValueConverter<Reviews> {
    public ReviewsConverter(Class<Reviews> clz) {
        super(clz);
    }

    public ReviewsConverter() {
        super(Reviews.class);
    }
}
