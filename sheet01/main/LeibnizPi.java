public class LeibnizPi {

    static void main() {
        int n = 1_000_000;
        double sum = 0;

        for(int k = 0; k <= n; k++){
            double i = 2.0 * k + 1.0;

            if(k % 2 == 1){
                sum -= 1.0 / i;
            }
            else{
                sum += 1.0 / i;
            }

        }

        double result = 4 * sum;

        System.out.println(result);
    }

}
