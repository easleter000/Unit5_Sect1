@FunctionalInterface
interface GCDCalculator {
    int calculateGCD(int num1, int num2);
}

public class main {
    public static void main(String[] args) {
        GCDCalculator gcdCalculator = (num1, num2) -> {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            return num1;
        };

        int result = gcdCalculator.calculateGCD(12, 18);
        System.out.println("GCD of 12 and 18 is: " + result); // Output: GCD of 12 and 18 is: 6
    }
}