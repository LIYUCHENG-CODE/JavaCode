package iostream.fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamShow1 {
    public static void main(String[] args) throws IOException {

        try(
                FileInputStream in = new FileInputStream("src/iostream/fileinputstream/MainThreadShow.txt");
                FileOutputStream out = new FileOutputStream("src/iostream/fileinputstream/out.txt")

                ){
            byte[] buffer = new byte[10]; // 建立一个缓冲区
            int len = in.read(buffer);
            String copyStr = new String(buffer);
            System.out.println(copyStr);  // out: I am happy
            len = in.read(buffer);
            String copyStr2 = new String(buffer);
            System.out.println(copyStr2);  // out: to join w


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
