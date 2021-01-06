//牛客健康评估
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader djj=new BufferedReader(new InputStreamReader(System.in));
        String[] str=djj.readLine().split(" ");
        double Weight=Double.parseDouble(str[0]);
        double Height=Double.parseDouble(str[1]);
        double BMI=Weight/Height/Height;
        if(BMI>=18.5&&BMI<=23.9){
            System.out.println("Normal");
        }else{
            System.out.println("Abnormal");
        }

    }
}
