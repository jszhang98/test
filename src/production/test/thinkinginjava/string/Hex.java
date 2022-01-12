package production.test.thinkinginjava.string;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for(byte b : data) {
            if(n % 16 == 0)
                result.append(String.format("%05X: ", n));
            result.append(String.format("%02X ", b));
            n++;
            if(n % 16 == 0) result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }
    public static void main(String[] args) throws Exception {
 //       if(args.length == 0)
        if(args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for(String arg : args) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while(m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }

// Test by displaying this class file:
//            System.out.println(
///                    format(BinaryFile.read("Hex.class")));
//        else
//            System.out.println(
//                    format(BinaryFile.read(new File(args[0]))));
    }
}
