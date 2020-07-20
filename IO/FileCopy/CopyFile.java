package IO.FileCopy;

/*
    文件复制
        步骤：
            1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
            2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
            3.使用字节输入流的方法read，读取文件
            4.使用字节输出流的方法write，写入文件
            5.释放资源
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //创建一个字节输入流对象，读取
        FileInputStream fis = new FileInputStream("D:\\photo\\image\\ren.jpg");
        //创建一个字节输出流对象，写入
        FileOutputStream fos = new FileOutputStream("E:\\test\\testdemo\\upload\\ren.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("复制文件耗时:"+(end-start) + "毫秒");
    }
}
