package IO.Writer;

/*
    续写和换行
 */

import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\test\\testdemo\\upload\\test.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("哈"+"\r\n");
        }
        fw.flush();
        fw.close();
    }
}
