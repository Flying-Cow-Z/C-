import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader rs = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rs.readLine());
        String [] str = rs.readLine().split(" ");
        int [] m = new int[n];
        if(n >=5 && n <= 40){
            for(int i = 0;i<n;i++){
                m[i] = Integer.parseInt(str[i]);
            }
        }
        int temp ;
        for(int i = 0;i<m.length-1;i++){
            for(int j = 0;j<m.length-1-i;j++){
                if(m[j]<m[j+1]){
                    temp = m[j];
                    m[j] = m[j+1];
                    m[j+1] =temp;
                }
            }
        }
        for(int i = 0;i<=4;i++){
            System.out.print(m[i]+" ");
        }
    }
}