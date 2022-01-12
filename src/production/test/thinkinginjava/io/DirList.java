package production.test.thinkinginjava.io;

import java.io.File;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class DirList {
    public static void main(String[] args){
        File path = new File(".\\src\\production\\test\\thinkinginjava\\io\\");
        String[] list;

        if(args.length == 0){
            list = path.list();
        }else{
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String  dirItem: list ) {
            System.out.println(dirItem);
        }
        InputStream b ;
        FilterInputStream x ;

    }
}
