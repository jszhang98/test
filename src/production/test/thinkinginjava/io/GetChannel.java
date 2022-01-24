package production.test.thinkinginjava.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class GetChannel {
    private static final int BSIZE = 1024;
    public static void main(String[] args) throws IOException {
        //write a file
        FileChannel fc = new FileOutputStream("data.text").getChannel();
        fc.write(ByteBuffer.wrap("this is a test".getBytes()));
        fc.close();

        //read a file
        fc = new FileInputStream("c:\\setup.log").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        String encoding = System.getProperty("file.encoding");
        Charset.forName(encoding).decode(buff);
        System.out.println(System.getProperty("file.encoding"));
        "abc".getBytes();
        //buff.mark()
        while(buff.hasRemaining()){
            //ichar a = (char)buff.get();
            System.out.print((char)buff.get());
        }
    }
}
