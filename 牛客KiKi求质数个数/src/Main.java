//牛客KiKi求质数个数
public class Main{

    public static void main(String[] args) {
        int num = 0;
        boolean flag=true;
        for(int i=100;i<1000;i++){
            flag=true;
            for (int j = 2; j<i;j++) {
                if(i%j==0) {
                    flag=false;
                    break;
                }

            }
            if(flag) num++;
        }
        System.out.println(num);
    }
}