package IO.OutputStream;

/*
    追加写
        调用两个参数的构造方法

    写换行
        windows:\r\n
        linux:/n
        mac:/r
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\test\\testdemo\\upload\\a.txt",true);
        fos.write("你好".getBytes());
        fos.write("\r\n".getBytes());
        fos.close();
    }
}
