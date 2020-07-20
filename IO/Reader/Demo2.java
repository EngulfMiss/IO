package IO.Reader;

/*
    FileReader可以读取IDEA默认的编码格式的文件
    FileReader读取系统默认编码(GBK)会产生乱码
 */

import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\test\\testdemo\\upload\\a.txt");
        int len = 0;
        char[] ch = new char[128];
        while((len = fr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
        fr.close();
    }
}
