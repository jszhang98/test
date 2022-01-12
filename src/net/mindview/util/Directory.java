//: net/mindview/util/Directory.java
// Produce a sequence of File objects that match a
// regular expression in either a local directory,
// or by walking a directory tree.
package net.mindview.util;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public final class Directory {
    // return an array of file for a specified directory.
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    // an overload function for local with string parameter.
    public static File[] local(String path, final String regex) { // Overloaded
        return local(new File(path), regex);
    }

    // A two-tuple for returning a pair of objects:
    //implement an Iterable for the class.
    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<File>();
        public List<File> dirs = new ArrayList<File>();

        // The default iterable element is the file list:
        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        public String toString() {
            return "dirs: " + PPrint.pformat(dirs) + "\n\nfiles: " + PPrint.pformat(files);
        }
    }

    public static TreeInfo walk(String start, String regex) { // Begin recursion
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) { // Overloaded
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) { // Everything
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else // Regular file
                if (item.getName().matches(regex)) result.files.add(item);
        }
        return result;
    }

    // Simple validation test:
    public static void main(String[] args) {
        if (args.length == 0) {
            TreeInfo  a = walk(".");
            System.out.println(a);
        }
        else for (String arg : args)
            System.out.println(walk(arg));
    }
} ///:~
