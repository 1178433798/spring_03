package zrj.abstractclass.impl;

import org.springframework.stereotype.Component;
import zrj.abstractclass.QQlogin;

@Component
public class QQloginImpl implements QQlogin {
    @Override
    public String Login(String token) {
        System.out.println(token);
        return null;
    }
}
