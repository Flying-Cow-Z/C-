import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/7/23
 * 10:18
 */
public class Test {

    //给定一个有序整型数组, 实现二分查找
    public static int found(int []arr,int key) {

        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = (left + right)>>>1;
            if (arr[mid]<key){
                left = mid + 1;
            }else if (arr[mid]>key){
                right = mid-1;
            }else {
                return  mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        System.out.println("找到了"+ found(arr,3) );

    }


    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
//    public static void copyOf(int []arr) {
//        int []arr2 = new int[arr.length];
//        int i = 0;
//        for (i=0;i<arr.length;i++){
//            arr2[i] = arr[i];
//        }
//
//            System.out.println(Arrays.toString(arr2));
//
//    }
//    public static void main(String[] args) {
//        int []arr = {1,2,3,4};
//        copyOf(arr);
//    }

   //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
    // 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量
//   public static String toString(int []arr){
//      if (arr == null){
//          return null;
//      }
//      if (arr.length == 0){
//          return "[]";
//      }
//      String ret = "[";
//      int i = 0 ;
//      for (i = 0;i<arr.length;i++){
//          if (i != arr.length - 1){
//              ret += arr[i] + ",";
//          }else {
//              ret += arr[i] + "]";
//          }
//      }
//
//    return ret;
//   }
//    public static void main(String[] args) {
//        int []arr = {1,2,3};
//        System.out.println(toString(arr));;
//    }

//    public static int  max(int[]arr) {
//        int i = 0;
//        int m = 0;
//        for (i = 0; i < arr.length;i++){
//          if (m < arr[i]){
//              m = arr[i];
//          }
//        }
//     return m;
//    }
//    public static void main(String[] args) {
//        int []arr = {1,2,3};
//
//        System.out.println(   max(arr));
//    }

//    public static void my_tostring(int []arr) {
//        System.out.print("[");
//        int i = 0;
//        for ( i = 0;i<arr.length;i++){
//            if(i < arr.length-1){
//                System.out.print(arr[i]+",");
//            }
//            else {
//                System.out.print(arr[i]);
//            }
//        }
//        System.out.println("]");
//    }
//    public static void main(String[] args) {
//        int []arr = {1,3,5};
//        my_tostring(arr);
//    }

}