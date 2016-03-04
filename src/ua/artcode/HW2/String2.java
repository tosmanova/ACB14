package ua.artcode.HW2;

/**
 * Created by tos on 3/4/16.
 */
public class String2 {
    public String doubleChar(String str) {
        char[] charArray = str.toCharArray();
        String doubleString = "";
        for (int i = 0; i < charArray.length; i++) {
            doubleString = doubleString + charArray[i] + charArray[i];
        }
        return doubleString;
    }

}
