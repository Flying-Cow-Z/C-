package Test2;

//合法括号序列判断
public class Main {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        char[]arr = A.toCharArray();
        if(n % 2 != 0 || arr[0] == ')'){
            return false;
        }else{
            boolean boo = true;
            int i=0;
            int num = 0;
            for(i=0;i<n;i++) {
                if(arr[i] == '(') {
                    num++;
                }if(arr[i] == ')') {
                    num--;
                }
            }
            if(num != 0) {
                boo = false;
            }
            return boo;
        }

    }
}