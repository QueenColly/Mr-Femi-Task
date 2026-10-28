package arrayFunction;
public class SquareAndSort {

    public static int[] squareAndSort(int[] numbers) {

        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 46340 || numbers[i] < -46340) {
                throw new ArithmeticException("Number too large to square");
            }

            result[i] = numbers[i] * numbers[i];
        }

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {

                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }
}
