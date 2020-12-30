package production.test.decorator.mydecorator;

import java.io.*;
import java.nio.Buffer;

public class InputTest {
    public static void main(String[] args) throws IOException{
        int c ;
        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream( new FileInputStream("D:\\IdeaProjects\\test\\src\\production\\test\\decorator\\mydecorator\\test.txt")));
            while((c=in.read())>=0){
                System.out.print((char) c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
