package com.learn.jwttest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author jiutao.Tan
 * @date 2022-06-17
 */
public class Main {

    public static void main(String[] args) {
        String str = "2022-06-30 00:00:00";
        int c = str.indexOf(" ");
        String substring = str.substring(0, c);
        System.out.println(substring);
    }
}
