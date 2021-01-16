//牛客两种输入流模板
import java.io.*;
public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = br.readLine())!=null){
            String[] s = line.split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            System.out.println(a==b ? a+"="+b : a>b ? a+">"+b : a+"<"+b);
        }
    }
}

//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[]args) {
//        Scanner sc = new Scanner(System.in);
//
//        while(sc.hasNext()){
//            int t = sc.nextDouble();
//            System.out.println(t);
//        }
//    }
//}