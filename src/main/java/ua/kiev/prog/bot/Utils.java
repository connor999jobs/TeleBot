package ua.kiev.prog.bot;

import org.apache.commons.validator.EmailValidator;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.util.ValidatorUtils;

public class Utils {
    public static boolean isValidEmailAddress(String email) {
        return EmailValidator.getInstance().isValid(email);
    }




}
