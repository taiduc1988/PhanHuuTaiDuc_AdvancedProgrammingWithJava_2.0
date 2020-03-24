package B19_String_Regex.ClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRoom {
    private static final String ACCOUNT_REGEX = "^[ACP]+\\d{4}+[G-M]$";

    public ClassRoom() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        final String[] validAccount = new String[] {"A1234G", "C4567K", "P8977L"};
        final String[] invalidAccount = new String[] {"B2334O", "A345M", "P2afgL"};
        for (String classname: validAccount){
            boolean invalid = classRoom.validate(classname);
            System.out.println("class name is" + classname + " is valid " + invalid);
        }
        for (String classname: invalidAccount){
            boolean invalid = classRoom.validate(classname);
            System.out.println("class name is" + classname + " is valid " + invalid);
        }
    }
}
