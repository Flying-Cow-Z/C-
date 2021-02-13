import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 迷新
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String[] str=bf.readLine().split(" ");
        double money=Double.parseDouble(str[0]);
        int month=Integer.parseInt(str[1]);
        int date=Integer.parseInt(str[2]);
        int pass=Integer.parseInt(str[3]);
        //支出
        double expend=0;
        if (month==11&&date==11){
            if(pass==1){
                expend=money*0.7-50;
            }else{
                expend=money*0.7;
            }
        }else if (month==12&&date==12){
            if (pass==1){
                expend=money*0.8-50;
            }else{
                expend=money*0.8;
            }
        }else{
            expend=money;
        }
        if (expend<=0){
            expend=0;
        }
        System.out.printf("%.2f",expend);
    }
}