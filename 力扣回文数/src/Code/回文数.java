package Code;

import java.util.Scanner;

public class 回文数 {
    public static boolean isPalindrome(int x) {
     if (x<0) {
         return false;
     }
     String s = String.valueOf(x);
     char[]c = s.toCharArray();
        for (int i = 0; i < c.length/2; i++) {
          if (c[i] != c[c.length-1-i]){
              return false;
          }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flg = isPalindrome(a);
        System.out.println(flg);
    }
}
