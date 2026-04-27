public class FizzBuzz {

    public static void main() {

        int n = 15;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz\n");
            }

            else if (i % 3 == 0) {
                System.out.print("Fizz\n");
            }

            else if (i % 5 == 0) {
                System.out.print("Buzz\n");
            }

            else {
                System.out.print(i+"\n");
            }

        }
    }


}
