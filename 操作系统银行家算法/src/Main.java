
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        boolean Choose = true;
        String C;
        System.out.println("请输入进程个数：");
        int count = in.nextInt();
        System.out.println("请输入资源种类数：");
        int number = in.nextInt();
        BankerAlgorithm T = new BankerAlgorithm(count,number);
        T.start(count,number);
        while (Choose == true) {
            T.setRequest(count,number);
            System.out.println("您是否还要进行资源请求：y/n?");
            C = in.next();
            if (C.equals("n")) {
                Choose = false;
            }
            if(C.equals("y")){
                Choose = true;
            }
        }
    }
}

