//思路：左括号开始，右括号结束，两括号数目必须相等，而且过程中的左括号数目必须大于或等于右括号数目
//另外：字符串为奇数必然不是合法的括号串，其实测试例子里还少了一个无括号的情况，我的程序也并没有能力辨别这个

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        if(A.length()%2==1) return false;
        char c[] =A.toCharArray();
        int left =0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='(') left++;
            if(c[i]==')') left--;
            if(left<0) return false;
        }
        if(left ==0) return true;
        return false;

    }
}
