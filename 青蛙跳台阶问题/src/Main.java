
public class Main {
    //青蛙跳台阶问题
    public static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return fun(n - 1) + fun(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fun(n));
    }


}