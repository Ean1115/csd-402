package MasonerModule4ProgAssignment;
// Masoner Module 4.2 Program Assignment CSD-402
public class ArrayAverage {

    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {1, 2, 3, 4, 5};
        int[] intArray = {10, 20, 30, 40, 50, 60};
        long[] longArray = {100L, 200L, 300L, 400L, 500L, 600L, 700L};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8};

        System.out.println("Short array: " + java.util.Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));

        System.out.println("Int array: " + java.util.Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));

        System.out.println("Long array: " + java.util.Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));

        System.out.println("Double array: " + java.util.Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}
