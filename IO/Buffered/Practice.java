package IO.Buffered;

/*
    将一个带序号的文本排序
    步骤分析：
        1.创建一个HashMap集合，key用来存储文本的序号，value用来存放文本
        2.创建一个字符缓冲输入流对象，构造方法中绑定字节输入流
        3.创建字符缓冲输出流对象，构造方法中绑定字符输出流
        4.使用字符缓冲输入流的方法readLine，逐行读取文本
        5.对读取到的文本进行切割，获取文本中的序号和文本内容
        6.把切割好的序号和文本内容存储到HashMap集合中
        7.遍历HashMap集合，获取每一个键值对
        8.把每一个键值对拼接为一个文本行
        9.把拼接好的文本，使用字符缓冲输出流的方法write，写入到文件中
        10.释放资源
 */

import java.io.*;
import java.util.HashMap;

public class Practice {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("E:\\test\\testdemo\\upload\\test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\test\\testdemo\\upload\\new.txt"));
        String str= null;
        while((str = br.readLine())!=null){
            //对读取到的文本进行切割
            String[] arr = str.split("\\.");
            map.put(arr[0],arr[1]);
        }
        //遍历HashMap集合，获取每一个键值对
        for(String key:map.keySet()){
            String value = map.get(key);
            str = key + "." + value;
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
