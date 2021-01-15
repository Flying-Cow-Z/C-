//牛客小乐乐改数字

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n = sc.nextLong();
            long temp = 1;
            long res = 0;
            while (n != 0) {
                if (n%10%2!=0) {
                    res+=temp;
                }
                temp*=10;
                n/=10;
            }
            System.out.println(res);
        }
    }
}

