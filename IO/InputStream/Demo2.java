package IO.InputStream;

/*
    一次读取多个字节
    int read(byte[] b)
    明确两件事情
        1.方法的参数byte[]作用
            缓冲作用，一般定义1024的整数倍
        2.方法的返回值int是什么?
            读取的有效位数

    String类的构造方法
        String(byte[] bytes)
        String(byte[] bytes,int offset,int length)

 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\test\\testdemo\\upload\\a.txt");
        byte[] bytes = new byte[128];
        int len = 0;
        while((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        /*//读取的有效字节个数
        int len = fis.read(bytes);
        System.out.println(len);
        //System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));*/
        fis.close();
    }
}
