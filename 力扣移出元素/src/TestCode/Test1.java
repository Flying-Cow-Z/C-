package TestCode;

import java.util.Scanner;

public class Test1 {
    public static int removeElement(int[]nums, int val){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int num = nums.length;
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int[]arr = {1,2,2,2,5,6};
        int len = removeElement(arr,key);
        System.out.println(len);
    }
}
