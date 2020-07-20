package IO.PrintStream;

/*
    可以改变输出语句的目的地，改变打印流的流向
    使用System.setOut方法改变输出语句的目的地为参数传递的打印流的目的地
        static void setOut(PrintStream out)
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("控制台输出");

        PrintStream ps = new PrintStream("E:\\test\\testdemo\\upload\\test.txt");
        System.setOut(ps);
        System.out.println("我在文件输出");
        ps.close();
    }
}
