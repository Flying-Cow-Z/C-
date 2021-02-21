import java.util.Scanner;

public class Main {
       public static int Jiec(int n) {
        if(n == 1){
            return 1;
        }
        return n * Jiec(n-1);
    }
    public static void main(String[] args) {
        System.out.println("输入一个数字：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("它的阶乘为："+Jiec(n));
    }
}
