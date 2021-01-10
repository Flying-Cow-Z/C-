//牛客KiKi设计类继承
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = bf.readLine().split(" ");
        int r = Integer.parseInt(bf.readLine());
        int s = Integer.parseInt(bf.readLine());
        System.out.println((Integer.parseInt(nums[0]) * Integer.parseInt(nums[1])));
        double ci = 3.14 * r * r;
        if ((ci * 100) % 100 > 0) {
            System.out.println((double) Math.round(ci * 100) / 100);
        }
        else {
            System.out.println((int) ci);
        }
        System.out.println(s * s);
    }
}
