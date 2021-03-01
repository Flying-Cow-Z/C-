public class Main {
        public static void  pri (int n) {
        if (n<0){
            System.out.print("- ");
            n = -n;
        }
        if (n > 9){
           pri(n/10);
        }
        System.out.print(n%10+" ");
    }
    public static void main(String[] args) {
        int n = 1234;
        pri(n);
    }
}
