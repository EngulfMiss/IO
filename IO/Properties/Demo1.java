package IO.Properties;

/*
    java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
    Properties集合是唯一一个和IO流结合的集合
        可以使用Properties集合中的方法store把集合中的零时数据持久化写入到硬盘中存储
        可以使用Properties集合中的方法load把硬盘中保存的文件(键值对)，读取到集合中使用

    属性列表中每个键值对都是字符串
        Properties是一个双链集合
 */

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        show01();
    }

    /*
        使用Properties集合存储数据，遍历取出Properties集合中的数据
        Properties集合有一些操作字符串的特有方法
        - Object setProperty(String key,String value) 调用 Hashtable 的方法put
        - String getProperty(String key)
        - Set<String> stringPropertyNames() 返回此属性列表中的键集
     */
    private static void show01() {
        Properties prop = new Properties();
        //使用setProperty()向集合中添加数据
        prop.setProperty("Gnar","120");
        prop.setProperty("Neeko","124");
        prop.setProperty("KeLie","125");

        //使用stringPropertyNames()把Properties集合中的键取出存到Set集合中
        Set<String> names = prop.stringPropertyNames();

        for(String key:names){
            System.out.println("Key:" + key + ",Value:" + prop.getProperty(key));
        }

        /*Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }*/
    }
}
