//时间复杂度和空间复杂度都是最低的算法
public int calculateMax(int[] prices) {
        int firstBuy = Integer.MIN_VALUE, firstSell = 0;
        int secondBuy = Integer.MIN_VALUE, secondSell = 0;

        for (int curPrice : prices) {
        firstBuy = Math.max(firstBuy, -curPrice);
        firstSell = Math.max(firstSell, firstBuy + curPrice);
        secondBuy = Math.max(secondBuy,firstSell - curPrice);
        secondSell = Math.max(secondSell, secondBuy + curPrice);
        }
        return secondSell;
        }

//参考https://www.nowcoder.com/practice/9370d298b8894f48b523931d40a9a4aa?tab=answerKey

    /*时间复杂度O(n), 空间复杂度O(1)。

        firstBuy表示第一次买入的最大收益，因为是买入所以是负值；

        firstSell表示第一次卖出的最大收益；

        secondBuy表示第二次买入的最大收益；

        secondSell表示第二次卖出的最大收益*/