/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/7/26
 * 20:25
 */

class Person {
    public String name;
    public  int age ;
    public static void show(){
        System.out.println("吃饭");
    }
}

class Test {
    public static void main(String[] args) {
        // Person person = new Person();
//        System.out.println(person.name);
//        System.out.println(person.age);
        Person.show();
    }
}