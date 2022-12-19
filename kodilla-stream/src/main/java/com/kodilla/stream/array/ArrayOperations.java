package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        double result;
        IntStream.range(0, numbers.length)
                    .forEach(num -> System.out.println(numbers[num]));
        result = IntStream.range(0, numbers.length)
                .mapToDouble(num -> numbers[num])
                .average()
                .getAsDouble();
        return result;
    }
}
