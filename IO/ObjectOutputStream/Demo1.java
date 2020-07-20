package IO.ObjectOutputStream;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream:对象的序列化流
    作用：把对象以流的方式写入到文件中保存

    构造方法：
        ObjectOutputStream(OutputStream out)

    特有的成员方法:
        void writeObject(Object obj) 将指定的对象写入 ObjectStream

    使用步骤：
        1.创建ObjectOutputStream对象，构造方法传递字节输出流
        2.使用ObjectOutputStream对象中的方法writeObject把对象写入到文件中
        3.释放资源
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\test\\testdemo\\upload\\a.txt"));
        oos.writeObject(new Person("Gnar",7));
        oos.writeObject(new Person("Neeko",17));
        oos.flush();
        oos.close();
    }
}
