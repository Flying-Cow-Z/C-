package Test2;

//糖果问题：A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
       // A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
        //现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int n4 = sc.nextInt();

            int a = (n1 + n3) / 2;
            int b = a - n1;
            int c = b - n2;
            if(b + c == n4) {
                System.out.println(a + " " + b + " " + c);
            }else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}