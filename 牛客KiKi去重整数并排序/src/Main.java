//牛客KiKi去重整数并排列
import java.io.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(sc.readLine());
        String[] ss=sc.readLine().split(" +");
        int[] arr = new int[a];
        for(int i=0;i< a;i++){
            arr[i]=Integer.parseInt(ss[i]);
        }
        Arrays.sort(arr);
        StringBuilder scs = new StringBuilder();
        int aa=arr[0];
        scs.append(arr[0]).append(" ");
        for(int i:arr){
            if(aa!=i){
                scs.append(i).append(" ");
                aa=i;
            }
        }
        System.out.println(scs.toString().trim());
    }
}