package IO.Buffered;

/*
    使用步骤：
        1.创建FileOutputStream缓冲流对象，构造方法中绑定要输出的目的地
        2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象,提高FileOutputStream对象效率
        3.使用BufferedOutput对象中的方法write，把数据写入到内部缓冲区中
        4.使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据，刷新到文件中
        5.释放资源
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\test\\testdemo\\upload\\test.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("将多个数据写入到内存缓冲区中".getBytes());
        bos.flush();
        bos.close();
    }
}
