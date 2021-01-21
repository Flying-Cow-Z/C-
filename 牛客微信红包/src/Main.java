import java.util.Arrays;

//牛客微信红包
public class Main{
    public int Gift(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int[]newGifts = new int[n+1];
        int num = gifts[0];
        int count = 1;
        int max = 1;
        int maxNum = num;

        for (int i = 0; i < n; i++) {
            newGifts[i] = gifts[i];
        }
        newGifts[n] = 0;

        for (int j = 0; j < n; j++) {
                if (newGifts[j] == num){
                    count++;
                }else{
                    if (count > max){
                        max = count;
                        maxNum = num;
                    }else{
                        num = newGifts[j];
                        count = 1;
                    }

                }
        }
        if (max<gifts.length/2){
            return 0;
        }else{
            return maxNum;
        }

    }
}
