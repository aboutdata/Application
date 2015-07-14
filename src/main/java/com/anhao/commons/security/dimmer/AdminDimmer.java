package com.anhao.commons.security.dimmer;

import com.anhao.domain.Admin;
import org.apache.commons.lang3.StringUtils;

/**
 * @显示用户时使用 @ 默认13661014724
 * @ dim之后 136******724 ******* @author youyou
 */
public class AdminDimmer {

    public static Admin dim(Admin admin) {
        admin.setName(maskName(admin.getName()));
//        admin.setMobile(mask(admin.getMobile(), 3, 4));
//        admin.setIdNumber(maskIdNumber(admin.getIdNumber()));
        admin.setEmail(maskEmail(admin.getEmail()));
        return admin;
    }

    private static String mask(String content, int offset, int length) {
        if (StringUtils.isEmpty(content)) {
            return "";
        }
        assert content.length() >= offset + length;
        char[] chars = content.toCharArray();
        for (int i = offset; i < offset + length; i++) {
            chars[i] = '*';
        }
        return new String(chars);
    }

    private static String maskIdNumber(String idNumber) {
        if (StringUtils.isEmpty(idNumber)) {
            return "";
        }

        return mask(idNumber, idNumber.length() == 15 ? 5 : 8, 9);
    }

    private static String maskEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return "";
        }
        int offset = 0;
        int length = email.indexOf('@');
        if (length > 2) {
            offset = 2;
            length -= offset;
        }
        return mask(email, offset, length-2);
    }

    private static String maskName(String name) {
        if (StringUtils.isEmpty(name)) {
            return "";
        }
        return mask(name, name.length() - 1, 1);
    }

    public static String maskLoginName(String loginName) {
        if (loginName.length() < 2) {
            return "*";
        }
        return mask(loginName, 1, loginName.length() > 2 ? loginName.length() - 2 : 1);
    }
}
