import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0; i<n-1; i+=2){
                if(arr[i] != arr[i+1]){
                    System.out.print(arr[i]+" ");
                    i = i-1;
                    if(i+2 == n-1){
                        System.out.print(arr[n-1]+" ");
                    }
                }else{
                    if(i+2 == n-1){
                        System.out.print(arr[n-1]+" ");
                    }
                }
            }
        }
    }
}