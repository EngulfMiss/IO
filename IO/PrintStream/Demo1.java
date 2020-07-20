package IO.PrintStream;

/*
    java.io.PrintStream : 打印流
    特点：
        1.只负责数据的输出，不负责读取
        2.与其他输出流不同，它永远不会抛出IOException,但会抛出FileNotFoundException
        3.有特有的方法
            print(任意类型的数据)
            println(任意类型的数据)

    构造方法：
        PrintStream(File file) : 输出的目的地是一个文件
        PrintStream(OutputStream out) ： 输出的目的地是一个字节输出流
        PrintStream(String FileName) : 输出的目的地是一个文件路径

    注意：
        如果使用继承自父类的write方法写数据，那么查看的时候会查询编码表 97->a
        如果使用自己特有的方法print/println方法写数据，写的数据原样输出 97->97

 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("E:\\test\\testdemo\\upload\\a.txt");
        //ps.write(97);
        ps.println(97);
        ps.println("NP");
        ps.close();
    }
}
