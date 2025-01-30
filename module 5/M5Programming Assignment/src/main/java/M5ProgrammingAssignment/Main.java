//*Masoner Module 5 Programming Assignment*/
package M5ProgrammingAssignment;

public class Main {
    public static void main(String[] args) {
        double[][] doubleArray = {
            {1.2, 3.4, 5.6},
            {7.8, 9.0, 2.3},
            {4.5, 6.7, 8.9}
        };

        int[][] intArray = {
            {1, 3, 5},
            {7, 9, 2},
            {4, 6, 8}
        };

        int[] largestDouble = LocateElement.locateLargest(doubleArray);
        int[] largestInt = LocateElement.locateLargest(intArray);
        int[] smallestDouble = LocateElement.locateSmallest(doubleArray);
        int[] smallestInt = LocateElement.locateSmallest(intArray);

        System.out.println("Largest in double array: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Largest in int array: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest in double array: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
        System.out.println("Smallest in int array: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
    }
}
