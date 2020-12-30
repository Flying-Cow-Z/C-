import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s=reader.readLine())!=null){
            int n = Integer.parseInt(s);
            Queue<Integer> queue=new LinkedList<>();
            for (int i = 0; i < n; i++) {
                queue.offer(i);
            }
            while (queue.size()!=1){
                for (int i = 0; i < 2; i++) {
                    queue.offer(queue.poll());
                }
                queue.poll();
            }
            System.out.println(queue.peek());
        }

    }

}