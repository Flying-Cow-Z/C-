import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/10/6
 * 16:44
 */
public class MyArrayList {

    public int [] elem ;
    public int usedSized;

    public MyArrayList () {
        this.elem = new int[5];
        this.usedSized = 0;
    }

     // 打印顺序表
     public void display() {
         for (int i = 0; i < usedSized; i++) {
             System.out.print(elem[i] + " ");
         }
         System.out.println();
     }

     //在 pos 位置新增元素
     public void add(int pos, int data) {
        if (pos < 0 || pos > this.usedSized) {
            System.out.println("位置不合法！");
            return ;
        }

        //扩容
         if(this.usedSized == this.elem.length) {
             this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
         }

        int i = this.usedSized - 1;
        while (i >= pos ) {
            elem[i+1] = elem[i];
            i--;
        }
        this.elem[pos] = data;
        this.usedSized++;
     }

    // 判定是否包含某个元素
     public boolean contains(int toFind) {
         for (int i = 0; i < this.usedSized; i++) {
             if (this.elem[i] == toFind) {
                 return true;
             }
         }
                 return false;
    }

     // 查找某个元素对应的位置
     public int search(int toFind) {
         for (int i = 0; i < this.usedSized; i++) {
             if (this.elem[i] == toFind) {
                 return i;
             }
         }
         return -1;
     }


    // 获取 pos 位置的元素
     public int getPos(int pos) {
         for (int i = 0; i < usedSized; i++) {
             if (pos < 0 || pos >= usedSized){
                 return -1;
             }

         }
         return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value
     public void setPos(int pos, int value) {
         for (int i = 0; i < usedSized; i++) {
             if (pos < 0 || pos >= usedSized) {
                 return;
             }
             this.elem[pos] = value;
         }
     }
         // 删除第一次出现的关键字key
         public void remove ( int toRemove) {

            int index = search(toRemove);
            if (index == -1){
                System.out.println("没有该数字！");
                return;
            }

            for (int i = index; i < this.usedSized-1; i++) {
                     this.elem[i] = this.elem[i+1];
                 }
           this.usedSized--;

         }

         // 获取顺序表长度
         public int size () {
             return this.usedSized;
         }


         // 清空顺序表
         public void clear () {
             this.usedSized = 0;
         }



    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);

        myArrayList.display();
        myArrayList.remove(2);
        myArrayList.display();
    }
}
