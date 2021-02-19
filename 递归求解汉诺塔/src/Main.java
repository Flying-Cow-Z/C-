import java.util.Scanner;

public class Main {
    //递归求解汉诺塔问题

//    /**
//     * n :盘子的个数
//     * p1:代表起始柱子
//     * p2：代表中转柱子
//     * p3：代表结尾柱子
//     * @param args
//     */
    public static void move(char p1,char p2) {
        System.out.print(p1 + "—>" + p2+" ");
    }

    public static void Hanoi(int n,char p1,char p2,char p3) {
        if (n == 1){
            move(p1,p3);
        }
        else{
            Hanoi(n-1,p1,p3,p2);
            move(p1,p3);
            Hanoi(n-1,p2,p1,p3);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Hanoi(n,'A','B','C');
    }

}
