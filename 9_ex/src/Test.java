import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/7/24
 * 22:29
 */
public class Pvf{
    static boolean Paddy;
    public static void main(String args[]){
        System.out.println(Paddy);
    }
}

//public class Test {
//    public int aMethod(){
//        static int i = 0;
//        i++;
//        return i;
//    }
//    public static void main(String args[]){
//        Test test = new Test();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }
//}

//public class Test {



    //数组逆序
//    public static void niXu(int []arr) {
//
//
//        int i =0;
//        int j =arr.length-1;
//
//        while (i < j  ) {
//
//         int temp = arr[j];
//         arr[j] = arr[i];
//         arr[i] = temp;
//         i++;
//         j--;
//
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
//        int []arr = {1,2,3,4};
//        niXu(arr);
//    }

    //冒泡排序
//    public static void bubble(int []arr) {
//         boolean flag = false;
//        int i = 0;
//   long start = System.currentTimeMillis();     System.nanuTime();
//        for (i= 0;i<arr.length-1;i++) {
//            int j = 0;
//            int temp=0;
//            flag =false;
//            for (j = 0;j<arr.length-1-i;j++) {
//              if (arr[j]>arr[j+1]) {
//                  temp = arr[j+1];
//                  arr[j+1] = arr[j];
//                  arr[j] = temp;
//                  flag = true;
//              }
//            }
//             if(flag == false){          或者if(!flag)
//                 break;
//    }
//        }
//    long end = System.currentTimeMillis();
//      for (i=0;i<arr.length;i++){
//          System.out.print(arr[i]+" ");
//      }
//         System.out.print(end-start);
//    }
//
//    public static void main(String[] args) {
//        int []arr = {1,6,3,9,7};
//        bubble(arr);
////        int ret = bubble(arr);
////        System.out.println(ret);
//    }

    //判断数组是否为顺序
//    public static boolean isSorted(int []arr) {
//        if(arr == null || arr.length == 0){
//            return false;
//        }
//        int i = 0;
//      while(i<arr.length-1){
//            if(arr[i]<arr[i+1]){
//                i++;
//            }else {
//                return false;
//            }
//
//        }
//      return true;
//    }
//    public static void main(String[] args) {
//        int []arr = {1,2,5,4};
//        System.out.println( isSorted(arr));
//
//    }
//}
