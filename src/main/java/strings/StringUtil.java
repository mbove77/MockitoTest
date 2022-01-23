package strings;

public class StringUtil {

    public static boolean isEmpty(String str) {
        if (str == null) return true;
        return str.trim().isEmpty();
    }
}
