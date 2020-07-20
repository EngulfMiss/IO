package IO.ObjectOutputStream;

/*
    序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
    类通过实现java.io.Serializable接口启动序列化功能，未实现接口的类无法使用任何状态序列化和反序列化
    Serializable接口也叫标记性接口
        要进行序列化和反序列化的类必须实现Serializable接口，会给类一个标记
        当我们进行序列化和反序列化的时候，就会检测这个类上是否有这个标记
            有，可以序列化和反序列化
            没有，抛出NotSerializableException异常


    静态的是不能被序列化的，static优先于对象加载进内存，而序列化是对对象进行序列化
    transient关键字：瞬态关键字
        被transient修饰的成员变量，也不能序列化
        作用：有不想被序列化的成员变量，可以用transient去修饰
 */

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
