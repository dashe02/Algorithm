package com.exercise1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wecash on 19/3/19.
 */
public class PhoneValidate {

    public static void main(String[] args) {
        String[] phoneList = {"13312345678", "18687654324", "18277748494", "15898494958", "45364"};
        PhoneValidate p = new PhoneValidate();
        p.phoneValidate(phoneList);
    }

    private void phoneValidate(String[] phoneList) {
        for (String phone : phoneList) {
            String result = isValidate(phone);
            if (result == null) {
                result = "-1";
            }
            System.out.println(phone + "===" + result);
        }
    }

    private String isValidate(String phone) {
        if (phone.length() != 11) {
            return null;
        }
        if (ifDianXin(phone)) {
            return "China Telecom";
        } else if (isLianTong(phone)) {
            return "China Unicom";
        } else if (isYidong(phone)) {
            return "China Mobile Communications";
        }
        return null;
    }

    private boolean ifDianXin(String phone) {
        String regex = "^(133|153|180|181|189)\\d{8}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);
        return m.find();
    }

    private boolean isLianTong(String phone) {
        String regex = "^(130|131|155|185|186)\\d{8}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);
        return m.find();
    }

    private boolean isYidong(String phone) {
        String regex = "^(135|136|150|182|188)\\d{8}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);
        return m.find();
    }
}
