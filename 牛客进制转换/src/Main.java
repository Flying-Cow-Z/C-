public class Main {
    /**
     * 进制转换
     * @param M int整型 给定整数
     * @param N int整型 转换到的进制
     * @return string字符串
     */
    public String solve (int M, int N) {
        // write code here
        if (M == 0) {
            return 0+"";
        }
        StringBuilder s = new StringBuilder();
        String hex = "0123456789ABCDEF";
        boolean flag = false;
        while (true) {
            if (M == 0) {
                break;
            } else if (M < 0) {
                flag = true;
                M = -M;
            }
            s.append(hex.charAt(M%N));
            M = M/N;
        }
        if (flag) {
            return "-" + s.reverse().toString();
        }
        return s.reverse().toString();
    }
}