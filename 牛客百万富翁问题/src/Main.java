public class Main {
    public static void main(String[] args) {

        int a = 10;
        //富翁支出的钱
        int sum = a * 30;
        int num = 0;
        for (int i = 0; i < 30; i++) {
            num += (int) Math.pow(2, i);
        }
        System.out.println(sum + " " + num);

        }

    }