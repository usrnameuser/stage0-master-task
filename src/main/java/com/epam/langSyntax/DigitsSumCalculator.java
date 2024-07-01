package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String numberString = String.valueOf(number);
        char[] numberCharArray = numberString.toCharArray();
        int digitSum = 0;
        for(char numberChar : numberCharArray) {
            digitSum += Character.getNumericValue(numberChar)
        }
        System.out.println(digitSum); 
    }

}
