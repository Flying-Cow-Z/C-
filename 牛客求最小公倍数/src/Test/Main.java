package Test;

//求A和B的最小公倍数

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//        int max = a>b?a:b;
//        int i = 0;
//        for (i = max; i >= max ; i++) {
//            if (a==0 || b==0){
//                System.out.println("无最小公倍数");
//                break;
//            }
//            if (i%a == 0 && i%b == 0 ) {
//                System.out.println("最小公倍数为"+i);
//                break;
//            }
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int max = a>b?a:b;
            int i = 0;
            for (i = max; i >= max ; i++) {
                if (a==0 || b==0){
//                    System.out.println("无最小公倍数");
//                    break;
                    System.out.println("无");
                    return;
                }
                if (i%a == 0 && i%b == 0 ) {
                    System.out.println("最小公倍数为"+i);
                    break;
                }
            }
         }

    }
}
