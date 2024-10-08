package com.adnj.buddysearchshareutils.enums.Converter;

import com.adnj.buddysearchshareutils.enums.UserStatus;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class UserStatusConverter extends ValueCodeConverter<UserStatus> {

    public UserStatusConverter(Class<UserStatus> clz) {
        super(clz);
    }

    public UserStatusConverter() {
        super(UserStatus.class);
    }
}
