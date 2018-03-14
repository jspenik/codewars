package codewars;

public class Reverse {

    public String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        return str.charAt(str.length() - 1) + (str.length() > 1 ? reverse(str.substring(0, str.length() - 1)) : "");
    }

    public String reverseBest(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
