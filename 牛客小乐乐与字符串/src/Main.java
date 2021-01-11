//牛客小乐乐与字符串
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        char[] a=s.toCharArray();
        long c=0;long h=0;long n=0;
        for (int i=0;i<a.length;i++){
            if(a[i]=='C'){
                c++;
            }else if(a[i]=='H'){
                h=h+c;
            }else if(a[i]=='N'){
                n=h+n;
            }
        }
        System.out.println(n);

    }
}