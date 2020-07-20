package IO.Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
    BufferedReader
    特有的成员方法：
        String readLine() 读完返回null
 */

public class Demo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\test\\testdemo\\upload\\a.txt"));
        String str = null;
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
