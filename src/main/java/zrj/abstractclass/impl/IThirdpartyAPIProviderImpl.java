package zrj.abstractclass.impl;

import org.springframework.stereotype.Component;
import zrj.abstractclass.IThirdpartyAPIProvider;

@Component
public class IThirdpartyAPIProviderImpl implements IThirdpartyAPIProvider {
    @Override
    public String GetDataFromAPI(String url, String token) {
        System.out.println(url+"-------"+token);
        return url+token;
    }
}
