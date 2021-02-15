import java.util.*;
//快速排序QuickSort
public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i=0 ; i<n;i++) {
            numbers[i] = scanner.nextInt();//循环获取数组
        }

        if(numbers.length>0)
        {
            Quicksort(numbers, 0, numbers.length-1);
        }

        for (int i : numbers) {
            System.out.printf(i + " ");
        }
        scanner.close();


    }
    //获取中轴，把numbers[0]作为中轴，两侧分化，一侧比中轴小，一侧比中轴大
    //返回中轴所在
    public static int getMiddle(int[] numbers,int low,int high)
    {
        int temp = numbers[low];
        while(low<high)
        {
            while (low<high&&numbers[high]>=temp)//改写为<=可以实现从大到小排序
            {
                high--;
            }
            if(low<high)
            {
                numbers[low]=numbers[high];
            }
            while (low<high&&numbers[low]<=temp)//同上
            {
                low++;
            }
            if(high>low)
            {
                numbers[high]=numbers[low];
            }
        }
        numbers[low] = temp;
        return low;
    }
    //迭代快排，将中轴的两侧再次求中轴，分化，直至low==high，完成快排
    public static void Quicksort(int[] numbers,int low,int high)
    {
        if (low<high)
        {
            int middle = getMiddle(numbers, low, high);
            Quicksort(numbers, low, middle-1);
            Quicksort(numbers, middle+1, high);
        }
    }
}