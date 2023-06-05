package payload;
import org.apache.commons.lang3.RandomStringUtils;

public class eWaiverPro {
    public static String generateEdocName(){
        // random string of length 8 composed of alphabetic characters
        String s = RandomStringUtils.randomAlphabetic(5);
        return s;
    }
}
