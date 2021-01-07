//小乐乐排电梯
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a=0;
        if(n<12){
            System.out.println(2);
            return;
        }
        else if(n%12!=0){
            a = n/12;
        }else{
            a = n/12-1;
        }
        System.out.println(a*4+2);
    }
}