//这个题和上一个求数组的秩是类似的，逆序对=当前数组长度 - 秩，
//在秩的基础上，把左右子树对调一下就可以了，在秩的基础上修改两个不等号就ok了
public class AntiOrder {
    Node root = null;

    public int count(int[] A, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res  += helper(A[i]);
        }
        return res;
    }

    public int helper(int a) {
        if (root == null) {
            root = new Node(a);
            return 0;
        } else {
            root.insert(a);
            return root.getRank(a);
        }
    }
}

class Node {
    int leftSize = 0;
    Node left, right;
    int val;

    public Node(int v) {
        val = v;
    }

    public void insert(int v) {
        if (v > val) {
            if (left != null)
                left.insert(v);
            else
                left = new Node(v);
            leftSize++;
        } else {
            if (right != null)
                right.insert(v);
            else
                right = new Node(v);
        }
    }

    public int getRank(int v) {
        if (v == val)
            return leftSize;
        if (v > val)
            return left.getRank(v);
        if (v < val)
            return leftSize + 1 + right.getRank(v);
        return 0;
    }
}