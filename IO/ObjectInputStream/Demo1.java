package IO.ObjectInputStream;

/*
    java.io.ObjectInputStream extends InputStream
    ObjectInputStream:对象的反序硫化流
    作用：把文件中保存的对象，以流的方式读取出来使用

    构造方法：
        ObjectInputStream(InputStream in) 创建从指定InputStream读取的ObjectInputStream

    特有的成员方法：
        Object readObject() 从ObjectInputStream读取对象

    使用步骤：
        1.创建ObjectInputStream对象,构造方法中传递字节输入流
        2.使用ObjectInputStream的readObject方法，读取对象
        3.释放资源
 */

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\test\\testdemo\\upload\\a.txt"));
        Object obj = null;
        try {
            while ((obj = ois.readObject()) != null) {
                System.out.println(obj);
            }
        }catch (EOFException e){
            System.out.println("读取完毕");
        }
        ois.close();

    }
}
