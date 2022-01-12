package production.test.thinkinginjava.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {
    public static void main(String[] args){
        File path = new File(".\\src\\production\\test\\thinkinginjava\\io\\");
        String[] list;

        if(args.length == 0){
            list = path.list();
        }else{
            final String regex = args[0];
            //pass an instance of an interface to implement the filter of the directory.
            //use the anonymous inner class.
            list = path.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    Pattern pattern = Pattern.compile(regex);
                    return pattern.matcher(name).matches();
                }
            });
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String  dirItem: list ) {
            System.out.println(dirItem);
        }
    }
}
