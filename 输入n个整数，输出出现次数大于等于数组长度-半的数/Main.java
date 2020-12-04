package Test;

//输入n个整数，输出出现次数大于等于数组长度-半的数。

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //将字符串变为字符数组，并将空格去掉
        String[] s = str.split(" ");
        Integer[] arr = new Integer[s.length];
        //将字符数组转为Integer类型的数组
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int len = arr.length / 2;
        //定义一个容量为100的数组，然后遍历arr数组，
        //将arr里面的数值与a的下标对应，如果相同，就将a里面的值++；
        //最后遍历a数组，找到满足条件的数字，将其打印出来。
        int[] a = new int[100];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (arr[i] == j) {
                    a[j]++;
                }
            }
        }
        int ret = 0;
        for (int j = 0; j < a.length; j++) {
            if (len <= a[j]) {
                ret = j;
            }
        }
        System.out.println(ret);
    }

}

