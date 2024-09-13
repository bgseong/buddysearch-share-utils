package com.adnj.buddysearchshareutils.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AgeGenerator {

    public static Integer generateAge(String birth, LocalDateTime time){
        return (Integer.parseInt(birth)-
                Integer.parseInt(time.format(DateTimeFormatter.ofPattern("yyyyMMDD")))/10000);
    }
}
