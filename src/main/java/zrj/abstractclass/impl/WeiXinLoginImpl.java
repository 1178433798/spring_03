package zrj.abstractclass.impl;

import org.springframework.stereotype.Component;
import zrj.abstractclass.WeiXinLogin;

@Component
public class WeiXinLoginImpl implements WeiXinLogin {
    @Override
    public String Login(String token) {
        System.out.println(token);
        return null;
    }
}
