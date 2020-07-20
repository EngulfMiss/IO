package IO.ObjectStreamPractice;

/*
    练习：
        序列化集合
        当我们想在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中
        对集合进行序列化和反序列化

    分析：
        1.定义一个存储Person对象的ArrayList集合
        2.在ArrayList集合中存储Person对象
        3.创建一个序列化流ObjectOutputStream对象
        4.使用ObjectOutputStream 的方法writeObject进行序列化
        5.创建一个反序列化ObjectInputStram对象
        6.调用ReadObject
        7.把Object类型的集合转化为ArrayList类型
        8.遍历ArrayList集合
        9.释放资源
 */

import IO.ObjectOutputStream.Person;

import java.io.*;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("纳尔",7));
        list.add(new Person("妮蔻",17));
        list.add(new Person("天",27));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\test\\testdemo\\upload\\a.txt"));
        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\test\\testdemo\\upload\\a.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list2 = (ArrayList<Person>)o;
        for (Person person : list2) {
            System.out.println(person);
        }
        ois.close();
        oos.close();
    }
}
