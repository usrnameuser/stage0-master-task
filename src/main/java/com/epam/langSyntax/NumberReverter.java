package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String numberString = String.valueOf(number);
        StringBuilder numberStringBuilder = new StringBuilder(numberString);
        numberStringBuilder.reverse();
        System.out.println(numberStringBuilder.toString());

    }

}
