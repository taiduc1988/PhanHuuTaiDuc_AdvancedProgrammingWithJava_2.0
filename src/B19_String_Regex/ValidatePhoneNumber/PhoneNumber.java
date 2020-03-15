package B19_String_Regex.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String ACCOUNT_REGEX = "^\\(\\d{2}\\)-\\(\\d{10}\\)$";

    public PhoneNumber() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static final String[] validAccount = new String[] {"(84)-(0941910692)", "(81)-(0803098868)"};
    private static final String[] invalidAccount = new String[] {"(a8)-(0941910692)", "(-9)-(0809898999)", "(84)-(2222222222)"};

    public static void main(String[] args) {
        PhoneNumber phoneExample = new PhoneNumber();
        for (String phone:validAccount){
            boolean invalid = phoneExample.validate(phone);
            System.out.println("Phone number is" + phone + " is valid " + invalid);
        }
        for (String phone:invalidAccount){
            boolean invalid = phoneExample.validate(phone);
            System.out.println("phone number is" + phone + " is valid " + invalid);
        }
    }
}
