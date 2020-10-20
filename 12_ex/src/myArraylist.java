import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/8/3
 * 21:59
 */
public class myArraylist {
    public int []eunm;
    public int usedSized;

    public myArraylist () {
        this.eunm = new int[5];
        this.usedSized = 0;
    }

    //向顺序表增加新元素
    public void add(int pos,int data ) {
    if (pos < 0 || pos > this.usedSized) {
        System.out.println("该位置不合法！");
        return;
    }
        //扩容
        if(this.usedSized == this.eunm.length) {
        this.eunm = Arrays.copyOf(this.eunm,2*this.eunm.length);
        }
        int i = this.usedSized - 1;
        while(i >= pos) {
            eunm[i+1] = eunm[i];
            i--;
        }
        this.eunm[pos] = data;
        this.usedSized++;
    }
    //打印顺序表
    public void display() {
        for (int i = 0;i < this.usedSized;i++) {
            System.out.print(eunm[i]+" ");
        }
    }
    //判定是否包含某个元素
    public boolean contains(int v) {
        for (int i = 0;i < this.usedSized;i++) {
            if(v == this.eunm[i]){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for (int i = 0;i < this.usedSized;i++){
            if(toFind == eunm[i]){
                return i;
            }
       }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos){
       return this.eunm[pos];
    }
    //删除
    public void remove(int toremove) {
        int index = this.search(toremove);
        if (index == -1){
            System.out.println("没有该数字");
            return;
        }
        for (int i = index; i <this.usedSized-1 ; i++) {
            this.eunm[i] = this.eunm[i+1];
        }
        this.usedSized--;
    }
    public static void main(String[] args) {
        myArraylist my_Arraylist = new myArraylist();
        my_Arraylist.add(0,1);
        my_Arraylist.add(1,2);
        my_Arraylist.add(2,3);
        my_Arraylist.add(3,4);
        my_Arraylist.add(4,5);
        my_Arraylist.display();
//        my_Arraylist.contains(6);
        my_Arraylist.remove(2);
        System.out.println("");
        my_Arraylist.display();
    }

}

