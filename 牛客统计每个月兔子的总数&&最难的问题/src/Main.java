//牛客统计每个月兔子的总数


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthCount = 1;
        int sum = 1;
        while (sc.hasNext()){
            monthCount = sc.nextInt();
            if (monthCount == 1 || monthCount == 2) {
                sum = 1;
                System.out.println(sum);
            }
            int old = 1;
            int month = 1;//新生兔子数量，
            int month2 = 1;//代表月份流逝,更改新生兔子下个月的年龄
            for (int i = 3;i<monthCount;i++){
                old = old+month;
                month = month2;
                month2 = old;
            }
            System.out.println(old+month);
        }


    }
}

//解法一：递归方案
//public class Main {
//
//    public static int getTotalCount(int monthCount){
//        if (monthCount == 1 || monthCount == 2) {
//            return 1;
//        }else{
//            return getTotalCount(monthCount-1) + getTotalCount(monthCount-2);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int month = 1;
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            month = sc.nextInt();
//            System.out.println(getTotalCount(month));
//        }
//
//    }
//
//
//}
