//牛客井字棋
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[][] s=new char[3][3];
        String str="";
        boolean flag=false;
        for(int i=0;i<3;i++){
            String str1=br.readLine();
            for(int j=0;j<3;j++) {
                s[i][j]=str1.charAt(2*j);
            }
        }
        if(!flag) {
            if(s[0][0]==s[1][1]&&s[1][1]==s[2][2]) {
                str=(s[0][0]=='K'?"KiKi wins!":(s[0][0]=='B'?"BoBo wins!":"No winner!"));
                flag=true;
            }
        }
        if(!flag) {
            if(s[2][0]==s[1][1]&&s[1][1]==s[0][2]) {
                str=(s[2][0]=='K'?"KiKi wins!":(s[2][0]=='B'?"BoBo wins!":"No winner!"));
                flag=true;
            }
        }
        if(!flag)
            for(int i=0;i<3;i++) {
                if(s[i][0]==s[i][1]&&s[i][1]==s[i][2]) {
                    str=(s[i][0]=='K'?"KiKi wins!":(s[i][0]=='B'?"BoBo wins!":"No winner!"));
                    flag=true;
                    break;
                }
                if(s[0][i]==s[1][i]&&s[1][i]==s[2][i]) {
                    str=(s[0][i]=='K'?"KiKi wins!":(s[0][i]=='B'?"BoBo wins!":"No winner!"));
                    flag=true;
                    break;
                }
            }
        if(!flag)
            str="No winner!";
        System.out.println(str);
    }

}