package IO.Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) throws IOException{
        show02();
    }

    /*
        void store(OutputStream out,String comments)
        void store(Writer writer,String comments)
        参数:
            OutputStream：字节输出流，不能写入中文
            Writer writer：字符输出流，可以写中文
            comments:注释：用来解释说明保存文件是做什么的，不能使用中文

        使用步骤：
            1.创建Properties集合对象，添加数据
            2.创建字节/字符流对象，构造方法中绑定要输出的目的地
            3.使用Properties集合中的方法store，把集合中的零时数据持久化到硬盘中
            4.释放资源
     */
    private static void show02() throws IOException {
        Properties prop = new Properties();
        //使用setProperty()向集合中添加数据
        prop.setProperty("Gnar","120");
        prop.setProperty("Neeko","124");
        prop.setProperty("KeLie","125");

        FileWriter fw = new FileWriter("E:\\test\\testdemo\\upload\\test.txt");
        prop.store(fw,null);
        fw.close();
    }
}
