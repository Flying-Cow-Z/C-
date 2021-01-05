//牛客求平方根
//实现函数 int sqrt(int x).
//计算并返回x的平方根（向下取整）
public class Main {
    /**
     *
     * @param x int整型 
     * @return int整型
     */
    public int sqrt (int x) {
        // write code here
        if(x<=1){
            return x;
        }
        int left=0;
        int right=x;
        while(left<right){
            int mid=(right+left)/2;
            if(x/mid>=mid){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return right-1;
    }
}