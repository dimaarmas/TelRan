public class HomeWork3Fibonacci {
    public static void main(String[] args) {
        printFirstNFibonacciNumbers(10); // must print numbers 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        printFirstNFibonacciNumbers(3); // must print numbers 0, 1, 1
        printFirstNFibonacciNumbers(11); // must print numbers 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    }

    /**
     * First 10 Fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
     * <p>
     * See definition here - https://en.wikipedia.org/wiki/Fibonacci_number
     *
     * @param n number of fibonacci numbers to be printed. >= 0
     */
    public static void printFirstNFibonacciNumbers(int n) {
            int firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci Series till " + n + " terms:");

            for (int i = 1; i <= n; i++) {
                System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
        }
    }
}
