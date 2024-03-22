package org.g5;

import java.io.PrintStream;
import java.util.List;

public class TestUtil {
    public static void printArr(String[] s1, PrintStream stream) {
        boolean first = true;
        for (String string : s1) {
            if (first) {
                stream.print(string);
                first = false;
            }
            else stream.print(", " + string);
        }
    }

    public static boolean compareStrings(List<String> s1, List<String> s2) {
        for (int i = 0; i < s1.size(); i++) {
            if (s1.get(i).equals(s2.get(i))) continue;
            else return false;
        }
        return true;
    }

    public static void printArr(List<String> s1, PrintStream stream) {
        boolean first = true;
        for (String string : s1) {
            if (first) {
                stream.print(string);
                first = false;
            }
            else stream.print(", " + string);
        }
    }

    public static boolean compareStrings(String[] s1, String[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(s2[i])) continue;
            else return false;
        }
        return true;
    }
}
