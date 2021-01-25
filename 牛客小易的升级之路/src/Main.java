//牛客小易的升级之路
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;//小易的初始能量
        int n = 0;//怪兽数量

        while (sc.hasNext()){
            a = sc.nextInt();
            n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                if (m<=a){
                    a += m;
                }else{
                    a += fun(m, a);
                }
            }
            System.out.println(a);
        }
    }

    /*辗转相除法，又名欧几里德算法，
    是一种非常高效的求最大公约数（GCD）的算法，它无需分解两个整数的质因子，
    辗转相除法的递推公式是GCD(a,b) = = GCD(b,a%b)，当a%b==0时，b即为所求的最大公约数
     */


    public static int fun(int a,int b){
        int temp;
        while(b>0){
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

}