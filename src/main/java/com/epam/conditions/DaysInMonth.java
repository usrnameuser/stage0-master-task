package com.epam.conditions;

import java.time.YearMonth;
import java.time.DateTimeException;

public class DaysInMonth {

    public void printDays(int year, int month) {
       try {
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();
            System.out.println(daysInMonth);
        } catch(DateTimeException dateTimeException) {
            System.out.println("invalid date");
        }
    }

}
