package StringTest;

import java.util.Scanner;

public class AUG2022 {
  public static char[] combineStrings(String s1, String s2) {

        char[] combined = new char[s1.length() + s2.length()];

        for (int i = 0; i < s1.length(); i++) {
            combined[i] = s1.charAt(i);
        }

        for (int i = 0; i < s2.length(); i++) {
            combined[s1.length() + i] = s2.charAt(i);
        }

        return combined;
    }
}
