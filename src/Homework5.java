public class Homework5 {

    public static void main(String[] args) {
        System.out.println(averageOfNumbers(3, 4, 5));
        System.out.println(averageOfNumbers(5, 10, 15));

    }

    //        Write a Java method that calculates and returns the average of three given numbers.

    private static int averageOfNumbers(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }
}
