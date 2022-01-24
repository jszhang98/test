package production.test.thinkinginjava.io;

import java.io.*;

public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("c:\\setup.log")));
        //FilterInputStream
        while (in.available()!=0){
           System.out.print((char)in.readByte());
        }


        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while((s = stdin.readLine()) != null && s.length()!= 0)
            System.out.println(s);

        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, world");


    }
}
