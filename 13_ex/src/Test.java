/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/8/4
 * 10:23
 */
public class Test {
    public static void main(String[] args) {
    MyArraylist myArraylist = new MyArraylist();
    myArraylist.addFirst(1);
    myArraylist.addFirst(2);
    myArraylist.addFirst(3);
    myArraylist.addFirst(2);
//    myArraylist.display();
//    myArraylist.Tail(5);
//    myArraylist.display();
//    myArraylist.addIndex(9,2);
//    myArraylist.display();
//    myArraylist.remove(9);
//    myArraylist.display();
//    System.out.println(myArraylist.contains(5));
//    System.out.println("======");
//    myArraylist.removeAllkey(2);
      //  myArraylist.reverseList();
        //myArraylist.display();
        //myArraylist.display2(myArraylist.reverseList());
        System.out.println(myArraylist.middleNode(myArraylist.head).data);
    }
}
