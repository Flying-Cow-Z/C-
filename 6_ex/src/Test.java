
//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
//import org.w3c.dom.ls.LSOutput;

//import java.sql.SQLOutput;
import java.util.Scanner;



public class Test {

    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
//    public static int max2(int a ,int b ) {
//        int max2 = 0;
//        return max2 =a > b?a : b;
//    }
//    public static int max3(int max2 ,int c ) {
//        int max3 = 0;
//        return max3 = max2 > c?max2 : c;
//    }
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        int c = 4;
//        System.out.println(max3(max2(a,b),c));
//    }

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
//    public static void main(String[] args) {
//        int []arr = {1,2,4,2,4,5,9};
//        int i = 0;
//        int j = arr.length -1 ;
//        while(i < j) {
//            while((i < j) && arr[i]%2 == 1){
//                i++;
//            }
//            while ( (i < j) && arr[i]%2 == 0){
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//                i++;
//                j--;
//            }
//        }
//        for ( i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//    }

    //求斐波那契数列的第n项。(迭代实现)

//    public static void main(String[] args) {
//        int a1 = 1;
//        int a2 = 1;
//        int a3 = 0;
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        if(n == 1 || n == 2) {
//            a1 = a2 = 1;
//        }
//        for (int i = 0; i < n - 2 ; i++) {
//            a3 = a1 + a2;
//            a1 = a2;
//            a2 = a3;
//        }
//        System.out.println(a3);
//    }

    //求1！+2！+3！+4！+........+n!的和

//    public static int Factorial(int a) {
//        int res = 1;
//        for (int i = a; i > 0 ; i-- ) {
//            res *= a;
//            a--;
//        }
//        return res;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("输入一个数：");
//        int a = scan.nextInt();
//        int sum = 0;
//        for (int i = a; i > 0; i--) {
//            sum +=  Factorial(a);
//            a--;
//       }
//        System.out.println(sum);
//    }


//    //求 N 的阶乘
//    public static int Factorial(int a) {
//        int res = 1;
//        for (int i = a; i > 0 ; i-- ) {
//            res *= a;
//            a--;
//        }
//        return res;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("输入一个数：");
//        int a = scan.nextInt();
//        System.out.println(Factorial(a));
//    }

    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
//    public static int find (int []arr) {
//        int ret = 0;
//        for (int i = 0; i <arr.length ; i++) {
//          ret ^= arr[i];
//        }
//        return ret;
//
//    }
//
//    public static void main(String[] args) {
//      //int []arr = {1,2,3,4,1,2,3};
//        System.out.println("请输入一串数字：");
//        Scanner scan = new Scanner(System.in);
//        int[]arr = new int[5];
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scan.nextInt();
//        }
//        System.out.println(find(arr));
//    }

}