package exercises.ex04_remove_duplicates;

import java.util.List;

public class RemoveDuplicateChars {

    public static String removeDuplicateCharacters(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return removeDuplicateCharacters(str.substring(1));
        } else {
            return str.charAt(0) + removeDuplicateCharacters(str.substring(1));
        }
    }

}



