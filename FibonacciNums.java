public class FibonacciNums {

    public static void main(String[] args) {
        FibonacciNums(10);

    }

    public static void FibonacciNums(int num_of_digits) {
        int c = 1;
        int n1 = 0;
        int n2 = 1;

        while (c <= num_of_digits) {
            System.out.println("Num"+c+": " + n1);
            int temp = n1;
            n1 = n2;
            n2 = (temp + n1);
            c += 1;
        }
    }

}
