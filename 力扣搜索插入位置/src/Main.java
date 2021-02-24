import java.util.Scanner;

public class Main {
    public static int searchInsert(int[] nums, int target) {
        
        for(int i = 0; i < nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int arr[] = {1,4,3,7,4};
        int index = searchInsert(arr,a);
        System.out.println(index);
    }
}
