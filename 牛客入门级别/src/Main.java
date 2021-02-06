import java.io.*;
public class Main{
    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]a = br.readLine().split("[;,]");
        String b = String.format("%.2f",Double.parseDouble((a[1])));
        String c = String.format("%.2f",Double.parseDouble((a[2])));
        String d = String.format("%.2f",Double.parseDouble((a[3])));
        System.out.println("The each subject score of  No. "+ a[0] +" is "+b+", " +c+", "+ d+".");

    }
}