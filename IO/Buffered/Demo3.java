package IO.Buffered;

/*
    java.io.BufferedWriter

    构造方法：
        BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲字符输出流
        BufferedWriter(Writer out,int sz)
    特有成员方法：
        void newLine() 写一个行分隔符，会根据不同的操作系统，获取不同的分隔符
    使用步骤：
        1.创建字符缓冲输出流，构造方法中传递字符输出流
        2.调用字符缓冲输出流write方法，把数据写入到内存缓冲区中
        3.调用字符缓冲输出流中的方法flush，把内存缓冲区的数据刷新到文件中
        4.释放资源
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\test\\testdemo\\upload\\a.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 10; i++) {
            bw.write("真的无聊");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
