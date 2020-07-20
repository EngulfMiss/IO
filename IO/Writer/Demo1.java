package IO.Writer;

/*
    java.io.Writer:字符输出流,是所有字符输出流的最顶层的父类，是一个抽象类

    构造方法：
        FileWriter(File file)
        FileWriter(String filename)

    使用步骤:
        1.创建FileWriter对象，构造方法中绑定要写数据的目的地
        2.使用FileWriter中的方法write，把数据写入到内存缓冲区中
        3.使用FileWriter中的方法flush，把内存中的数据，刷新到文件中
        4.释放资源(会先把内存缓冲区的数据写到文件中(flush))
 */

import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\test\\testdemo\\upload\\test.txt");
        //使用FileWriter中的方法write，把数据写入到内存缓冲区中
        fw.write(98);
        //使用FileWriter中的方法flush，把内存中的数据，刷新到文件中
        fw.flush();
        //释放资源(会先把内存缓冲区的数据写到文件中(flush))
        fw.close();
    }
}
