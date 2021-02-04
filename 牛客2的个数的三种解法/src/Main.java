//https://www.nowcoder.com/questionTerminal/31a9495eb02844fb8c0e9ab101053f53
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));
    }

    private static int fun(int n){
        if (n <= 1) return 0;
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i,b = n % i;
            //之所以补8，是因为当百位为0，则a/10==(a+8)/10，
            //当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
        }
        return count;
    }

}

    /**
     * 找规律解法
     * @param n
     * @return
     */
    /*private static int fun(int n) {

        int count = 0;
        int low = 0;
        int high = 0;
        int cur = 0;
        int flag = 1;
        while(n/flag!=0)
        {
            low = n-(n/flag)*flag;
            cur = (n/flag)%10;
            high = n/(flag*10);
            if(cur == 1 || cur == 0)
                count += high*flag;
            if(cur == 2)
                count += high*flag + low +1;
            if(cur > 2)
                count += (high+1)*flag;
            flag *= 10;
        }
        return count;
    }*/




    /**
     * 菜鸟解法
     * @param n
     * @return
     */
    /*private static int fun(int n) {

        int num = 0;
        for(int i=0; i<n+1; i++){
            int s = i;
            while(s>0){
                int temp = s%10;
                if(temp == 2){
                    num++;
                }
                s /= 10;
            }

        }
        return num;*/
    //}






