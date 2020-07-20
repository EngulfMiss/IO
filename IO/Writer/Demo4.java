package IO.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw= new FileWriter("E:\\test\\testdemo\\upload\\test.txt",false);
            for (int i = 0; i < 10; i++) {
                fw.write("嘤");
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //创建文件失败，null是不能调用方法的，会抛出空指针异常
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
