package TestCode;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = getValue(a);
        System.out.println(c);
    }

    private static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i*2;
            case 3:
                result = result + i*3;
        }
        return result;
    }
}
