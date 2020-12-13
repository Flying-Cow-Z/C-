package Test;

//读入一个字符串str，输出字符串str中的连续最长的数字串

/*算法思想：用max表示经过的数字长度最大值，count表示数字计数器，当为字母时重置为0
 *end表示数字尾部，每次满足数字时，对max进行判断，当max小于于count时，更新max和end
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int max = 0;
            int count=0;
            int end=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    count++;
                    if(max<count){
                        max= count;
                        end = i;
                    }
                }else{
                    count = 0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        char[]arr = str.toCharArray();
//        int len = str.length();
//        int max = 0;
//        int count = 0;
//        int end = 0;
//
//        for(int i=0;i<len;i++) {
//            //count = 0;
//            if(arr[i]>='0' && arr[i]<='9') {
//                count++;
//                if(max < count) {
//                    max = count;
//                    end = i;
//                }
//            }else{
//                count = 0;
//            }
//        }
//        System.out.println(str.substring(end-max+1,end+1));
//    }
//}

//public class Main{
//
//    public static void main(String[] args) {
//        String str1 = "hello";
//        String str2 = "he" + new String("llo");
//        System.out.println(str1 == str2);
//    }
//}

//class Test
//{
//    private int data;
//    int result = 0;
//    public void m()
//    {
//        result += 2;
//        data += 2;
//        System.out.print(result + " " + data);
//    }
//}
//
//class ThreadExample extends Thread
//{
//    private Test mv;
//    public ThreadExample(Test mv)
//    {
//        this.mv = mv;
//    }
//    public void run()
//    {
//        synchronized(mv)
//        {
//            mv.m();
//        }
//    }
//}
//
//public class Main {
//    public static void main(String args[])
//    {
//        Test mv = new Test();
//        Thread t1 = new ThreadExample(mv);
//        Thread t2 = new ThreadExample(mv);
//        Thread t3 = new ThreadExample(mv);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//
//}
