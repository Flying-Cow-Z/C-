import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       while (sc.hasNext()){
           int n = sc.nextInt();
           BigInteger[] a= new BigInteger[n];
           for (int i = 0; i < n; i++) {
               a[i] = sc.nextBigInteger();
           }
           Arrays.sort(a);
           for (int i = 0; i < n; i++) {
               System.out.println(a[i]);
           }
       }

    }
}
