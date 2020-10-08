import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/7/22
 * 13:55
 */
public class Test {
     //青蛙跳台阶问题
     public static int fun(int n) {
         if(n == 1){
             return 1;
         }
         if(n == 2){
             return 2;
         }

         return fun(n-1) +fun(n-2);
     }
     public static void main(String[] args) {
         int n = 6;
         System.out.println(  fun(n));
     }


    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
//    public static void funny(int []arr) {
//        int i = 0;
//        for ( i = 0;i < arr.length;i++){
//            arr[i] = i+1;
//        }
//        for ( i = 0;i < arr.length;i++){
//            System.out.println(arr[i] + " ");
//        }
//
//    }
//    public static void main(String[] args) {
//        int []arr = new int[100];
//        funny(arr);
//    }

    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值
//    public static void printArray(int []arr) {
//        for (int i = 0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        int []arr = {1,2,3,5,6};
//        printArray(arr);
//    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
//    public static void   transform(int []arr) {
//        int i = 0;
//        for (i = 0; i <arr.length ; i++) {
//            arr[i] *= 2;
//        }
//        for (i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        int []arr = {1,2,3};
//        transform(arr);
//    }

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和
//        public static double sum(double[]arr ) {
//        double sum = 0;
//        int i=0;
//        for (i = 0;i < arr.length;i++ ){
//            sum += arr[i];
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        double []arr = {1,2,3,4};
//        System.out.println(sum(arr));
//    }


    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型)
//    public static double avg(double[]arr ) {
//        double sum = 0;
//        int i=0;
//        for (i = 0;i < arr.length;i++ ){
//            sum += arr[i];
//        }
//        double  avg1 = sum / (arr.length);
//
//        return avg1;
//    }
//    public static void main(String[] args) {
//        double []arr = {1,2,3,4};
//        System.out.println(avg(arr));
//    }

    //递归求解汉诺塔问题

//    /**
//     * n :盘子的个数
//     * p1:代表起始柱子
//     * p2：代表中转柱子
//     * p3：代表结尾柱子
//     * @param args
//     */
//    public static void move(char p1,char p2) {
//        System.out.print(p1 + "—>" + p2+" ");
//    }
//
//    public static void Hanoi(int n,char p1,char p2,char p3) {
//        if (n == 1){
//            move(p1,p3);
//        }
//        else{
//            Hanoi(n-1,p1,p3,p2);
//            move(p1,p3);
//            Hanoi(n-1,p2,p1,p3);
//        }
//
//    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        Hanoi(n,'A','B','C');
//    }

    //递归求斐波那契数列的第 N 项
//    public static int  Fibonacci(int n) {
//        if (n == 1 || n == 2){
//            return 1;
//        }
//        return  Fibonacci(n-1) +  Fibonacci(n-2);
//
//    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int ret = Fibonacci(n);
//        System.out.println(ret);
//    }


    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
//    public static int sum(int n) {
//        if (n == 0){
//            return 0;
//        }
//
//      return n%10 + sum(n/10);
//    }
//    public static void main(String[] args) {
//        int n= 1234;
//        System.out.println( sum(n));
//    }

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
//    public static void  pri (int n) {
//        if (n<0){
//            System.out.print("- ");
//            n = -n;
//        }
//        if (n > 9){
//           pri(n/10);
//        }
//        System.out.print(n%10+" ");
//    }
//    public static void main(String[] args) {
//        int n = 1234;
//        pri(n);
//    }

    //递归求 1 + 2 + 3 + ... + 10
//    public static int sum(int n) {
//        if(n == 1){
//            return 1;
//        }
//        return n + sum(n-1);
//    }
//    public static void main(String[] args) {
//        int n = 10;
//        System.out.println("1 + 2 + 3 + ... + 10和为 "+sum(10));
//    }
    //递归求 N 的阶乘
//    public static int Jiec(int n) {
//        if(n == 1){
//            return 1;
//        }
//        return n * Jiec(n-1);
//    }
//    public static void main(String[] args) {
//        System.out.println("输入一个数字：");
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        System.out.println("它的阶乘为："+Jiec(n));
//    }

    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
//    public static int add(int a,int b) {
//        return  a + b;
//    }
//    public static double add(double x,double y,double z) {
//        return  x + y + z;
//    }
//
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println(add(a,b));
//        double x = 10.1;
//        double y = 20.1;
//        double z = 30.1;
//        System.out.println(add(x,y,z));
//    }


   // 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，
    // 以及两个小数和一个整数的大小关系
//   public static int max(int a,int b) {
//       int max1 = 0;
//       return max1 = a>b ? a:b;
//   }
//    public static double max(double c,double d) {
//        double max2 = 0;
//        return max2 = c>d ? c:d;
//    }
//    public static double max(double max2,int a) {
//       double max3 = 0;
//        return max3 = max2>(double)a ? max2:(double)a;
//    }
//   public static void main(String[] args) {
//       int a = 5;
//       int b = 6;
//       System.out.println("两整数的最大值："+max(a,b));
//       double c = 3.01;
//       double d = 5.06;
//       double res = max(c,d);
//       System.out.println("两小数的最大值："+res);
//       System.out.println("两个小数和一个整数的大小关系:"+max(res,a)+"大");
//   }
}
