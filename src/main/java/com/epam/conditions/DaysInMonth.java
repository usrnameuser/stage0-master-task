package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
       // if(year > 0) {
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();
            System.out.println(daysInMonth);
        //} else {
        //    System.out.println("invalid date");
        //}
    }

}
