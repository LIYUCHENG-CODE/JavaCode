package iostream.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamShow2 {
    public static void main(String[] args){
        try(
                FileInputStream in = new FileInputStream("src/iostream/fileinputstream/MainThreadShow.txt"); // 创建输入实例
                FileOutputStream out = new FileOutputStream("src/iostream/fileinputstream/out.txt")  // 创建输出实例
                ){
            byte[] buffer = new byte[10]; // 缓冲区 大小为10 byte
            int len = in.read(buffer, 0,10);  // 方法read将读取到的内容放进缓冲区数组buffer中，并返回读取到的字节数，若返回值为-1，就是没有可用字节
            while (len != -1){
                out.write(buffer, 0 ,len);
                len = in.read(buffer);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
