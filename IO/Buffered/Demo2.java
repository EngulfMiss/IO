package IO.Buffered;

/*
    java.io.BufferedInputStream extends InputStream
    BufferedInputStream:字节缓冲输入流

    BufferedInputStream(InputStream in)
    BufferedInputStream(InputStream in,int size)

    使用步骤：
        1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        2.创建BufferedInputStream对象,构造方法中传递FileInputStream对象，提高FileInputStream对象的读取效率
        3.使用BufferedInputStream对象中的方法read
        4.释放资源

 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\test\\testdemo\\upload\\test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
