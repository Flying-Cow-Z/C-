package CodeTest;

public class 力扣大写转小写 {
    public static String toLowerCase(String str) {
        if(str == null && "".equals(str)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(c >= 'A' && c <= 'Z'){
                sb.append((char)(c+32));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "HeLLo";
        System.out.println(toLowerCase(str));

    }
}

//用位运算的技巧就行了

//大写变小写、小写变大写 : 字符 ^= 32;
//大写变小写、小写变小写 : 字符 |= 32;
//小写变大写、大写变大写 : 字符 &= -33;
/*
string toLowerCase(string str) {
    for(auto &i : str){
        i |= 32;
    }
    return str;
}*/
