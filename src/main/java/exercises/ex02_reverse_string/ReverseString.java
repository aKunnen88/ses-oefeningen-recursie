package exercises.ex02_reverse_string;

public class ReverseString {

    public static String reverse(String str) {

        if (str.length() <= 1) {
            return str;
        }

        // IN MIDDEN DELEN
        //  var mid = str.length()/2;
        // var firstHalf = str.subtring(0, mid);
        // var secondHalf = str.substring(mid);
        // return reverse(secondHalf) + reverse(firstHalf);


        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
