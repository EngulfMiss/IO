package IO.InputStreamReader;

/*
    构造方法:
        InputStreamReader(InputSteam in)
        InputStreamReader(InputStream in,String charsetName name)

    使用步骤:
        1.创建一个InputStreamReader对象
        2.使用InputStreamReader中的方法read读取文件

    注意事项：
        构造方法指定的字符集要和文件的字符集相同，否则会乱码
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
    public static void main(String[] args) throws IOException{
        //read_utf_8();
        read_gbk();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\test\\testdemo\\upload\\a.txt"),"utf-8");
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\test\\testdemo\\upload\\a.txt"),"gbk");
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
