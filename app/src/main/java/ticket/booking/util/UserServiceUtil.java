package ticket.booking.util;
import org.mindrot.jbcrypt.BCrypt;
public class UserServiceUtil {

    public static String hashedPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean checkPassword(String password,String hashedPassword){
        return BCrypt.checkpw(password, hashedPassword);
    }


}
