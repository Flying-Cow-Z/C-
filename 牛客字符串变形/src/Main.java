public class Main{
    public String trans(String s, int n) {
        // write code here
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                if(Character.isLowerCase(ch)){
                    sb.append(Character.toUpperCase(ch));
                }else{
                    sb.append(Character.toLowerCase(ch));
                }
            }else{
                sb.append(ch);
            }
        }
        s=sb.toString();
        String[]arr=s.split(" ",-1);
        int length=arr.length;
        for(int i=0;i<length/2;i++){
            String temp=arr[i];
            arr[i]=arr[length-1-i];
            arr[length-1-i]=temp;
        }
        return String.join(" ",arr);

    }
}