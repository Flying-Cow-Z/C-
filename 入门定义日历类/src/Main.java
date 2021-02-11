import java.io.*;
public class Main{
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] a = br.readLine().split(" ");
        System.out.println(a[2]+"/"+a[1]+"/"+a[0]);
    }
}