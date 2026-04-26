import java.util.function.DoubleToIntFunction;

public class PrimeFactors {

    static void main() {
        int n = 60;

        for(int i = 2; i <= n; i++ ){

            while(n % i == 0){

                n =n / i;

                System.out.println(i);

            }
        }
    }

}
