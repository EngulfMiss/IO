package IO.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\test\\testdemo\\upload\\test.txt");
        char[] ch = "Gnardadad".toCharArray();
        //从哪开始，写多少个
        fw.write(ch,0,ch.length-1);
        fw.flush();
        fw.write("你好你好");
        fw.flush();
        fw.write("真的厉害",2,2);
        fw.flush();
        fw.close();
    }
}
