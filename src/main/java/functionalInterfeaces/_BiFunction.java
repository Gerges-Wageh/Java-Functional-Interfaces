package functionalInterfeaces;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {

        // Using Normal Regular Function
        System.out.println(incrementByOneAndMultiply(4, 100));


        // Using BiFunction
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));

    }

    // Increment by 1 and multiply
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }

    // BiFunction: increment by 1 and multiply
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
