import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
          String[] p = sc.next().split("[.]");
          String[] a = sc.next().split("[.]");

          //转换为最小的单位Knut
          int pKnut = (Integer.valueOf(p[0])*17 + Integer.valueOf(p[1]))*29 + Integer.valueOf(p[2]);
          int aKnut = (Integer.valueOf(a[0])*17 + Integer.valueOf(a[1]))*29 + Integer.valueOf(a[2]);
          int money = aKnut - pKnut;

          //再换回来
          int knut = money % 29;
          int sickle = money/29%17;
          int galleon = money/29/17;

            System.out.println(galleon+"."+Math.abs(sickle)+"."+Math.abs(knut));
        }
    }
}
