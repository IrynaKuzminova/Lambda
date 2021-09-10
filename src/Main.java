public class Main {

    public static void main(String[] args) {
        OperationsWithInt maxValue = (a, b, c) -> {
            if (a > b && a > c) return a;
            if (b > a && b > c) return b;
            return c;
        };
        OperationsWithInt averageValue = (a, b, c) -> (a + b + c) / 3;
        OperationsWithInt sum = (a, b, c) -> a + b + c;
        System.out.println("Max value: " + maxValue.operation(3, 8, 5));
        System.out.println("Sum: " + sum.operation(3, 8, 5));
        System.out.println("Average value: " + averageValue.operation(3, 8, 5));
    }
}

@java.lang.FunctionalInterface
interface OperationsWithInt {
    int operation(int a, int b, int c);
}

