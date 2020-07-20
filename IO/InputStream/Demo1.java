package IO.InputStream;

/*
    java.io.InputStream:字节输入流
    是所有输入流的超类

    定义了所有子类共性的方法:
        int read()
        int read(byte[] b)
        void close()

    常用子类:
        java.io.FileInputStream

    构造方法:
        FileInputStream(String path)
        FileInputStream(File file)

    使用步骤:
        1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        2.使用FileInputStream对象中的read，读取文件
        3.释放资源
 */

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\test\\testdemo\\upload\\a.txt");
        int len = 0;
        while ((len = fis.read()) != -1){
            System.out.println((char) len);
        }

        /*int len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);*/
        fis.close();
    }
}
