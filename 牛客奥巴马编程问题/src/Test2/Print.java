//美国总统奥巴马不仅呼吁所有人都学习编程，甚至以身作则编写代码，成为美国历史上首位编写计算机代码的总统。
// 2014年底，为庆祝“计算机科学教育周”正式启动，奥巴马编写了很简单的计算机代码：在屏幕上画一个正方形。现在你也跟他一起画吧！

//输入描述：输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。
//输出描述：输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的行数实际上是列数的50%
//（四舍五入取整）。
package Test2;
import java.util.Scanner;
public class Print {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String b = in.next();
        int tmp = a;
        //int n = a/2;
        int i = 0;
        int j = 0;
        int row  = 0;
        if(a%2 == 0) {
            row = (a-2)/2;
        }else {
            row = (a-2)/2+1;
        }
        while (tmp>0) {
            System.out.print(b);
            tmp--;
        }
        System.out.println();
        for (j=1; j<row; j++){ // 控制行
            for (i=0; i<a; i++){
                if (i==0 || i==a-1){
                    System.out.print(b);
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        tmp = a;
        while (tmp>0) {
            System.out.print(b);
            tmp--;
        }

    }
}

//1.输入的数字col为列，那么行row只有他的一半，如果col是奇数，那么row = col/2 +1，否则row =col/2;
//
//2.开始双重循环，外层循环控制行数，内层控制列数，如果 为第一行或者最后一行或者第一列或者最后一列就把字符打印出来,否则就打印空格。

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int col = sc.nextInt();
//        String str = sc.next();
//        char c = str.charAt(0);
//        int row ;
//
//        if(col%2==0){
//            row = col/2;
//        }else{
//            row = col/2 + 1;
//        }
//
//        for(int i = 1;i<=row;i++){
//            for(int j = 1;j<=col;j++){
//                if(i==1||i==row ||j==1||j==col){
//                    System.out.print(c);
//                    //System.out.printf("%c",c);
//
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}