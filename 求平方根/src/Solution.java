//实现函数 int sqrt(int x).
//计算并返回x的平方根（向下取整)
public class Solution {
    /**
     *
     * @param x int整型 
     * @return int整型
     */
    public int sqrt (int x) {
        if(x == 1){
            return x;
        }
        int left = 0,right = x/2+1;
        while(left < right-1){
            int mid = (left+right)/2;
            if(x/mid > mid){
                left = mid;
            }else if(x/mid < mid){
                right = mid;
            }else{
                return mid;
            }
        }
        return left;
    }
}