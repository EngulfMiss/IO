package IO.OutputStream;

/*
    java.io.OutputStream:此抽象类是表示输出字节流的所有类的超类
    定义了一些子类共性的成员方法

    java.io.FileOutputStream extends OutputStream
    FileOutputStream:文件字节输出流
    作用：
        把内存中的数据写入到硬盘的文件中

    构造方法：
        FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流
        FileOutputStream(File file)
        参数为写入的目的地

    使用步骤：
        1.创建一个FileOutputStream对象，构造方法中传递目的地
        2.调用FileOutputStream对象中的write方法，把数据写入到文件中
        3.释放资源（流使用会占用一部分资源）

    常用write方法：
        write(int )
        write(byte[] b)
        write(byte[] b,int off,int len)
        off 开始索引   len 写几个
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("E:\\test\\testdemo\\upload\\a.txt"));
        /*byte[] bytes = {65,66,67,68,69};
        fos.write(bytes);*/
        byte[] bytes = "你好".getBytes();
        fos.write(bytes);
        fos.close();
    }
}
