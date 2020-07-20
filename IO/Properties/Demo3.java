package IO.Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) throws IOException{
        show03();
    }

    /*
        void load(InputStream inStream)  不能读取中文
        void load(Reader reader)  可以读取中文

        使用步骤：
            1.创建Properties集合对象
            2.使用Properties中的方法load读取保存键值对的文件
            3.遍历Properties集合
        注意：
            1.存储键值对的文件中，键值的链接符号可以使用，空格，=等等
            2.存储键值对的文件中，可以使用 # 进行注释，被注释的键值对不会被读取
            3.存储键值对的文件中，键与值默认都是字符串，不再加引号
     */
    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("E:\\test\\testdemo\\upload\\test.txt"));
        Set<String> key = prop.stringPropertyNames();
        for (String s : key) {
            String value = prop.getProperty(s);
            System.out.println(s + "=" + value);
        }
    }
}
