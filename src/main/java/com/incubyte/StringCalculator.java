package com.incubyte;

public class StringCalculator {

    public int add(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",|\n";
        String numString = numbers;

        if(numbers.startsWith("//")) {
            int delimiterEnd = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterEnd);
            numString = numbers.substring(delimiterEnd + 1);
        }

        String[] nums = numString.split(delimiter);
        int sum = 0;
        for(String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}