package map的使用;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * zrdn:张彪
 * 2020/11/9
 * 16:38
 */
public class Map的使用 {
    public static void main(String[] args) {
        Map<String,Integer> 通讯录 = new TreeMap<>();

        Integer v = 通讯录.put("abc",123);
        v = 通讯录.put("abc",456);

        v = 通讯录.remove("abc");
        System.out.println(v);
        System.out.println(通讯录);
    }
}
