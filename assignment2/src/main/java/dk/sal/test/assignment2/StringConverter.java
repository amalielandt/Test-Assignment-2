package dk.sal.test.assignment2;

public class StringConverter {

    public String reverseString(String str) {

        String result = "";
        for(int i = str.length()-1; i >= 0; --i) {
            result += str.charAt(i);
        }
        
        return result;
    }

    public String stringToUpperCase(String str) {

        String result = "";
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                ch = (char) (str.charAt(i) - 32);
            } else {
                ch = str.charAt(i);
            }
            result += ch;
        }

        return result;
    }

    public String stringToLowerCase(String str) {

        String result = "";
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                ch = (char) (str.charAt(i) + 32);
            } else {
                ch = str.charAt(i);
            }
            result += ch;
        }

        return result;
    }
}
