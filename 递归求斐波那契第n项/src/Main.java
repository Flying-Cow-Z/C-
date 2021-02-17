import java.util.Scanner;

public class Main {
    //递归求斐波那契数列的第 N 项
    public static int  Fibonacci(int n) {
        if (n == 1 || n == 2){
            return 1;
        }
        return  Fibonacci(n-1) +  Fibonacci(n-2);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = Fibonacci(n);
        System.out.println(ret);
    }

}
