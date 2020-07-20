package IO.OutputStreamWriter;

/*
    构造方法:
        OutputStreamWriter(OutputStream out)
        OutputStreamWriter(OutputStream out,String charsetName)

    使用步骤:
        1.创建一个OutputStreamWriter对象，构造方法传递字节输出流和编码名称
        2.使用OutputStreamWriter的write方法，字符转换为字节存储
        3.flush
        4.释放资源
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo1 {
    public static void main(String[] args) throws IOException{
        write_utf8();
    }

    private static void write_utf8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\test\\testdemo\\upload\\a.txt"),"utf-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
