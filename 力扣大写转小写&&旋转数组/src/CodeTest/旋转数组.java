package CodeTest;

import java.util.Scanner;

public class 旋转数组 {
    public static void rotate(int[] nums, int k) {
        //方法1：临时数组
        int len = nums.length;
        int []arr = new int[len];
        //临时数组
        for (int i = 0; i < len; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[(i+k)%len] = arr[i];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

        //方法2：多次反转,先全部反转，再反转前k个，再反转剩下
        //先反转前面的，接着反转后面的k个，最后在反转全部 也可 ，原理都一样
        int len = nums.length;
        k %= len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

        //方法3：环形旋转
        int hold = nums[0];
        int index = 0;
        int len = nums.length;
        boolean []visited = new boolean[len];
        for (int i = 0; i < len; i++) {
            index = (index+k) % len;
            //防止打转情况，如果已访问，就直接访问下一个元素
            if (visited[index]) {
                index = (index+1) % len;
                hold = nums[index];
                i--;
            }else{
                visited[index] = true;
                int temp = nums[index];
                nums[index] = hold;
                hold = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {1,2,3,4,5,6};
        int k = sc.nextInt();
        rotate(arr,k);
    }
}
