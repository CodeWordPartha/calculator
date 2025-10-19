package com.incubyte;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> negatives = new ArrayList<>();

        for(String num : nums) {
            int n = Integer.parseInt(num);
            if(n < 0) {
                negatives.add(n);
            }
            sum += n;
        }

        if(!negatives.isEmpty()) {
            StringBuilder msg = new StringBuilder("negative numbers not allowed ");
            for(int i = 0; i < negatives.size(); i++) {
                msg.append(negatives.get(i));
                if(i < negatives.size() - 1) {
                    msg.append(",");
                }
            }
            throw new IllegalArgumentException(msg.toString());
        }

        return sum;
    }
}