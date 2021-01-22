import java.util.Scanner;
//牛客最难的问题
public class Main2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);
                if (c == ' '){
                    sb.append(" ");
                    continue;
                }

                int n = c - 'A';
                if (n<5){
                    char temp = (char)('Z'-4+n);
                    sb.append(temp);
                }else{
                    char temp = (char)(c-5);
                    sb.append(temp);
                }
            }
            System.out.println(sb.toString());
        }

        }

    }

