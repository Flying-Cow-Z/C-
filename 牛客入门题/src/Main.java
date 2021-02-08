public class Main {

    public static void main(String[] args){
        System.out.println("The size of short is "+Short.BYTES+" bytes.");
        System.out.println("The size of int is "+Integer.BYTES+" bytes.");
        System.out.println("The size of long is "+Long.BYTES+" bytes.");
        System.out.println("The size of long long is "+Long.BYTES+" bytes.");

    }
}

/*
public class Main{
    public static void main(String[] args){
        System.out.print("0" + Integer.toOctalString(1234) + " ");
        String hex = Integer.toHexString(1234);
        System.out.print( "0X" + hex.toUpperCase());
    }
}*/

/*
public class Main{
    public static void main(String[] args){
        System.out.println("       "+Integer.valueOf("ABCDEF",16));
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!".length());
        //printf在c语言里面返回的是字符串的长度，而Java没有这个功能，只能由。length来代替了
    }
}*/