package IO.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader:字符输入流顶层父类
    共性成员方法：
        int read() 读取单个字符并返回
        int read(char[] cbuf) 一次读取并释放多个字符,将字符读入数组
        void close()

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader:文件字符输入流
    作用：把硬盘文件中的数据以字符方式读取到内存

    构造方法：
        FileReader(String filename)
        FileReader(File file)

    使用步骤:
        1.创建FileReader对象
        2.使用FileReader对象的方法read
        3.释放资源
 */

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\test\\testdemo\\upload\\a.txt");
        //存储每次读取的有效个数
        int len = 0;
        //存储读取到的多个字符
        char[] ch = new char[1024];
        while((len = fr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
        fr.close();
    }
}
