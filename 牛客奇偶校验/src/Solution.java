import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.nextLine();
            jixiaoyan(a.toCharArray());//转为字符数组
        }
    }

    private static void jixiaoyan(char[] s) {
        int[]arr = new int[8];
        for (int i = 0; i < s.length; i++) {
            int n = 0x01;
            int j = 7;
            int num = 0;
            //统计1的个数
            while (j>0){
                arr[j] = (s[i]&n) == 0 ? 0:1;
                if (arr[j] == 1){
                    num++;
                }
                n = n<<1;
                j--;
            }

            //进行校验
            if ((num & 1) == 0){
                arr[0] = 1;
            }

            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k]);
            }
            arr[0] = 0;
            System.out.println();
        }
    }
}
