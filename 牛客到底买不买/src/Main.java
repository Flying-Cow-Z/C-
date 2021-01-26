//借鉴的博文https://blog.csdn.net/qq_44929652/article/details/107061573
//牛客到底买不买
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String have=sc.nextLine();
        String need=sc.nextLine();
        Map<Character,Integer> h=new HashMap<>();
        for(char c:have.toCharArray()){
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }else{
                h.put(c,1);
            }
        }
        Map<Character,Integer> n=new HashMap<>();
        for(char c:need.toCharArray()){
            if(n.containsKey(c)){
                n.put(c,n.get(c)+1);
            }else{
                n.put(c,1);
            }
        }
        boolean wealthy=true;
        int lack=0;
        for(Entry<Character,Integer> en:n.entrySet()){
            char k=en.getKey();
            int v=en.getValue();
            if(h.containsKey(k)&&h.get(k)<v){
                wealthy=false;
                lack+=v-h.get(k);
            }else if(!h.containsKey(k)){
                wealthy=false;
                lack+=v;
            }
        }
        if(wealthy){
            System.out.println("Yes "+(have.length()-need.length()));
        }else{
            System.out.println("No "+lack);
        }
    }
}
